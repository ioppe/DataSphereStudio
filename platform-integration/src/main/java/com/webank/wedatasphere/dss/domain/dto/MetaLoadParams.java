package com.webank.wedatasphere.dss.domain.dto;


import com.webank.wedatasphere.dss.domain.others.DataFilter;

import java.io.Serializable;

public class MetaLoadParams extends SampleTableParams implements Serializable {
    private String statusid;
    private String parentid;
    private String classid;
    private String namepathlike;
    private String rootid;
    private String metaname;
    private String tometaid;
    private String sysid;
    private String dbid;
    private String iscreateid;
    private String tabname;
    private DataFilter[] filters = new DataFilter[0];

    public String getStatusid() {
        return statusid;
    }

    public void setStatusid(String statusid) {
        this.statusid = statusid;
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid;
    }

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid;
    }

    public String getNamepathlike() {
        return namepathlike;
    }

    public void setNamepathlike(String namepathlike) {
        this.namepathlike = namepathlike;
    }

    public String getRootid() {
        return rootid;
    }

    public void setRootid(String rootid) {
        this.rootid = rootid;
    }

    public String getMetaname() {
        return metaname;
    }

    public void setMetaname(String metaname) {
        this.metaname = metaname;
    }

    public String getSysid() {
        return sysid;
    }

    public void setSysid(String sysid) {
        this.sysid = sysid;
    }

    public DataFilter[] getFilters() {
        return filters;
    }

    public void setFilters(DataFilter[] filters) {
        this.filters = filters;
    }


    public String getTometaid() {
        return tometaid;
    }

    public void setTometaid(String tometaid) {
        this.tometaid = tometaid;
    }

    public String getDbid() {
        return dbid;
    }

    public void setDbid(String dbid) {
        this.dbid = dbid;
    }

    public String getIscreateid() {
        return iscreateid;
    }

    public void setIscreateid(String iscreateid) {
        this.iscreateid = iscreateid;
    }

    public String getTabname() {
        return tabname;
    }

    public void setTabname(String tabname) {
        this.tabname = tabname;
    }
}
