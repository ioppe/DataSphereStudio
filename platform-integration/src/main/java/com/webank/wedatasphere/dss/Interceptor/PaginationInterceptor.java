package com.webank.wedatasphere.dss.Interceptor;

import com.webank.wedatasphere.dss.domain.dto.SampleTableParams;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.ParameterMapping;
import org.apache.ibatis.mapping.SqlSource;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;
import org.apache.ibatis.type.TypeHandlerRegistry;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

@Intercepts({
        @Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class})
})
public class PaginationInterceptor implements Interceptor {

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        Object[] args = invocation.getArgs();
        MappedStatement ms = (MappedStatement) args[0];
        Object parameter = args[1];

        // 判断方法名是否以 Paged 结尾
        if (!ms.getId().endsWith("Paged")) {
            return invocation.proceed();
        }

        // 判断参数类型是否是 SampleTableParams 或其子类
        if (!(parameter instanceof SampleTableParams)) {
            return invocation.proceed();
        }

        SampleTableParams params = (SampleTableParams) parameter;
        int pageNum = params.getPage();
        int pageSize = params.getLimit();

        // 获取原始 SQL
        BoundSql boundSql = ms.getBoundSql(parameter);
        String originalSql = boundSql.getSql();

        Connection connection = ms.getConfiguration().getEnvironment().getDataSource().getConnection();

        // 1. 查询总条数
        String countSql = "SELECT COUNT(*) FROM (" + originalSql + ") AS total";
        PreparedStatement countStmt = connection.prepareStatement(countSql);
        setParameters(countStmt, ms, boundSql, parameter);
        ResultSet rs = countStmt.executeQuery();
        int total = 0;
        if (rs.next()) {
            total = rs.getInt(1);
        }
        rs.close();
        countStmt.close();
        params.setCount(total);
        // 2. 修改分页 SQL
        String paginatedSql = originalSql + " LIMIT " + (pageNum - 1) * pageSize + ", " + pageSize;
        BoundSql newBoundSql = new BoundSql(ms.getConfiguration(), paginatedSql, boundSql.getParameterMappings(), parameter);
        //setParameters
        List<ParameterMapping> parameterMappings = boundSql.getParameterMappings();
        if (parameterMappings != null) {
            for (int i = 0; i < parameterMappings.size(); i++) {
                ParameterMapping parameterMapping = parameterMappings.get(i);
                String propertyName = parameterMapping.getProperty();
                if (boundSql.hasAdditionalParameter(propertyName)) {
                    newBoundSql.setAdditionalParameter(propertyName, boundSql.getAdditionalParameter(propertyName));
                }
            }
        }
        //
        MappedStatement newMs = copyFromMappedStatement(ms, new BoundSqlSqlSource(newBoundSql));
        args[0] = newMs;


        return (List<?>) invocation.proceed();
    }
    private void setParameters(PreparedStatement ps, MappedStatement ms, BoundSql boundSql, Object parameterObject) throws SQLException {
        // 获取 MyBatis 的配置对象
        Configuration configuration = ms.getConfiguration();
        TypeHandlerRegistry typeHandlerRegistry = configuration.getTypeHandlerRegistry();
        List<ParameterMapping> parameterMappings = boundSql.getParameterMappings();

        if (parameterMappings != null) {
            for (int i = 0; i < parameterMappings.size(); i++) {
                ParameterMapping parameterMapping = parameterMappings.get(i);
                String propertyName = parameterMapping.getProperty();
                TypeHandler<?> typeHandler = parameterMapping.getTypeHandler();
                JdbcType jdbcType = parameterMapping.getJdbcType();
                Object value;

                // 1. 检查是否为动态参数
                if (boundSql.hasAdditionalParameter(propertyName)) {
                    value = boundSql.getAdditionalParameter(propertyName);
                } else if (parameterObject == null) {
                    value = null;
                } else if (typeHandlerRegistry.hasTypeHandler(parameterObject.getClass())) {
                    // 2. 检查是否有对应的类型处理器
                    value = parameterObject;
                } else {
                    // 3. 使用 MetaObject 获取属性值
                    MetaObject metaObject = configuration.newMetaObject(parameterObject);
                    value = metaObject.getValue(propertyName);
                }

                // 设置 PreparedStatement 参数
                if (typeHandler != null) {
                    @SuppressWarnings("unchecked")
                    TypeHandler<Object> handler = (TypeHandler<Object>) typeHandler; // 泛型安全转换
                    handler.setParameter(ps, i + 1, value, jdbcType);
                } else {
                    throw new SQLException("No TypeHandler found for property " + propertyName);
                }
            }
        }
    }


    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {
        // 可通过 properties 设置插件配置
    }

    // 创建新的 MappedStatement
    private MappedStatement copyFromMappedStatement(MappedStatement ms, SqlSource newSqlSource) {
        MappedStatement.Builder builder = new MappedStatement.Builder(ms.getConfiguration(), ms.getId(), newSqlSource, ms.getSqlCommandType());
        builder.resource(ms.getResource());
        builder.fetchSize(ms.getFetchSize());
        builder.statementType(ms.getStatementType());
        builder.keyGenerator(ms.getKeyGenerator());
        builder.keyProperty(String.join(",", ms.getKeyProperties() != null ? ms.getKeyProperties() : new String[]{}));
        builder.timeout(ms.getTimeout());
        builder.parameterMap(ms.getParameterMap());
        builder.resultMaps(ms.getResultMaps());
        builder.resultSetType(ms.getResultSetType());
        builder.cache(ms.getCache());
        builder.flushCacheRequired(ms.isFlushCacheRequired());
        builder.useCache(ms.isUseCache());
        return builder.build();
    }

    private static class BoundSqlSqlSource implements SqlSource {
        private final BoundSql boundSql;

        public BoundSqlSqlSource(BoundSql boundSql) {
            this.boundSql = boundSql;
        }

        @Override
        public BoundSql getBoundSql(Object parameterObject) {
            return boundSql;
        }
    }
}