package com.webank.wedatasphere.dss.domain.others;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class DataFilter implements Serializable {

    private String columnname;
    private String comparer = "=";
    private String columnvalue;
    private Date columnvalueDate;
    private BigDecimal columnvalueNum;
    private Integer columnvalueInt;
    private List<String> columnvalueList;
    private List<String> columnvalueListData;
    private List<BigDecimal> columnvalueListNum;
    private List<Integer> columnvalueListInt;
    private String columntype;

    public DataFilter() {
    }

    public DataFilter(String columnname, String comparer, String columnvalue) {
        this.columnname = columnname;
        this.comparer = comparer;
        this.columnvalue = columnvalue;
    }

    public String getColumnname() {
        return columnname;
    }

    public void setColumnname(String columnname) {
        this.columnname = columnname;
    }

    public String getComparer() {
        return comparer;
    }

    public void setComparer(String comparer) {
        this.comparer = comparer;
    }

    public String getColumnvalue() {
        return columnvalue;
    }

    public void setColumnvalue(String columnvalue) {
        this.columnvalue = columnvalue;
    }

    public List<String> getColumnvalueList() {
        return columnvalueList;
    }

    public void setColumnvalueList(List<String> columnvalueList) {
        this.columnvalueList = columnvalueList;
    }

    public String getColumntype() {
        return columntype;
    }

    public void setColumntype(String columntype) {
        this.columntype = columntype;
    }

    public List<String> getColumnvalueListData() {
        return columnvalueListData;
    }

    public void setColumnvalueListData(List<String> columnvalueListData) {
        this.columnvalueListData = columnvalueListData;
    }

    public List<BigDecimal> getColumnvalueListNum() {
        return columnvalueListNum;
    }

    public void setColumnvalueListNum(List<BigDecimal> columnvalueListNum) {
        this.columnvalueListNum = columnvalueListNum;
    }

    public List<Integer> getColumnvalueListInt() {
        return columnvalueListInt;
    }

    public void setColumnvalueListInt(List<Integer> columnvalueListInt) {
        this.columnvalueListInt = columnvalueListInt;
    }

    public Date getColumnvalueDate() {
        return columnvalueDate;
    }

    public void setColumnvalueDate(Date columnvalueDate) {
        this.columnvalueDate = columnvalueDate;
    }

    public BigDecimal getColumnvalueNum() {
        return columnvalueNum;
    }

    public void setColumnvalueNum(BigDecimal columnvalueNum) {
        this.columnvalueNum = columnvalueNum;
    }

    public Integer getColumnvalueInt() {
        return columnvalueInt;
    }

    public void setColumnvalueInt(Integer columnvalueInt) {
        this.columnvalueInt = columnvalueInt;
    }
}
