package com.webank.wedatasphere.dss.mapper;




import com.webank.wedatasphere.dss.domain.dto.MetaLoadParams;
import com.webank.wedatasphere.dss.domain.entity.DmpMeta;

import java.util.List;

public interface DmpMetaMapper {

    List<DmpMeta> selectForList(MetaLoadParams params);


}