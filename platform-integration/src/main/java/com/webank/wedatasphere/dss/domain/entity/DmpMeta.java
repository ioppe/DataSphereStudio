package com.webank.wedatasphere.dss.domain.entity;

import java.io.Serializable;
import java.util.Date;

public class DmpMeta implements Serializable {
    private String sysid;

    private String statusid;

    private String status;

    private String deptid;

    private String deptname;

    private String datalevelid;

    private String datalevelno;

    private String datalevelname;

    private String creatorid;

    private String creatorname;

    private Date createon;

    private String modifierid;

    private String modifiername;

    private Date modifiedon;

    private String remark;

    private String orderno;

    private String parentid;

    private String isleaf;

    private String namepath;

    private String metano;

    private String metaname;

    private String iconno;

    private String classid;

    private String classname;

    private String tabname;

    private String iscreateid;

    private String iscreate;

    private String dastid;

    private String dbid;

    private String dbname;

    private String datamemo;

    private Integer hasrule;

    private String viewsql;

    private static final long serialVersionUID = 1L;

    public String getSysid() {
        return sysid;
    }

    public void setSysid(String sysid) {
        this.sysid = sysid == null ? null : sysid.trim();
    }

    public String getStatusid() {
        return statusid;
    }

    public void setStatusid(String statusid) {
        this.statusid = statusid == null ? null : statusid.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid == null ? null : deptid.trim();
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname == null ? null : deptname.trim();
    }

    public String getDatalevelid() {
        return datalevelid;
    }

    public void setDatalevelid(String datalevelid) {
        this.datalevelid = datalevelid == null ? null : datalevelid.trim();
    }

    public String getDatalevelno() {
        return datalevelno;
    }

    public void setDatalevelno(String datalevelno) {
        this.datalevelno = datalevelno == null ? null : datalevelno.trim();
    }

    public String getDatalevelname() {
        return datalevelname;
    }

    public void setDatalevelname(String datalevelname) {
        this.datalevelname = datalevelname == null ? null : datalevelname.trim();
    }

    public String getCreatorid() {
        return creatorid;
    }

    public void setCreatorid(String creatorid) {
        this.creatorid = creatorid == null ? null : creatorid.trim();
    }

    public String getCreatorname() {
        return creatorname;
    }

    public void setCreatorname(String creatorname) {
        this.creatorname = creatorname == null ? null : creatorname.trim();
    }

    public Date getCreateon() {
        return createon;
    }

    public void setCreateon(Date createon) {
        this.createon = createon;
    }

    public String getModifierid() {
        return modifierid;
    }

    public void setModifierid(String modifierid) {
        this.modifierid = modifierid == null ? null : modifierid.trim();
    }

    public String getModifiername() {
        return modifiername;
    }

    public void setModifiername(String modifiername) {
        this.modifiername = modifiername == null ? null : modifiername.trim();
    }

    public Date getModifiedon() {
        return modifiedon;
    }

    public void setModifiedon(Date modifiedon) {
        this.modifiedon = modifiedon;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    public String getIsleaf() {
        return isleaf;
    }

    public void setIsleaf(String isleaf) {
        this.isleaf = isleaf == null ? null : isleaf.trim();
    }

    public String getNamepath() {
        return namepath;
    }

    public void setNamepath(String namepath) {
        this.namepath = namepath == null ? null : namepath.trim();
    }

    public String getMetano() {
        return metano;
    }

    public void setMetano(String metano) {
        this.metano = metano == null ? null : metano.trim();
    }

    public String getMetaname() {
        return metaname;
    }

    public void setMetaname(String metaname) {
        this.metaname = metaname == null ? null : metaname.trim();
    }

    public String getIconno() {
        return iconno;
    }

    public void setIconno(String iconno) {
        this.iconno = iconno == null ? null : iconno.trim();
    }

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid == null ? null : classid.trim();
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }

    public String getTabname() {
        return tabname;
    }

    public void setTabname(String tabname) {
        this.tabname = tabname == null ? null : tabname.trim();
    }

    public String getIscreateid() {
        return iscreateid;
    }

    public void setIscreateid(String iscreateid) {
        this.iscreateid = iscreateid == null ? null : iscreateid.trim();
    }

    public String getIscreate() {
        return iscreate;
    }

    public void setIscreate(String iscreate) {
        this.iscreate = iscreate == null ? null : iscreate.trim();
    }

    public String getDastid() {
        return dastid;
    }

    public void setDastid(String dastid) {
        this.dastid = dastid == null ? null : dastid.trim();
    }

    public String getDbid() {
        return dbid;
    }

    public void setDbid(String dbid) {
        this.dbid = dbid == null ? null : dbid.trim();
    }

    public String getDbname() {
        return dbname;
    }

    public void setDbname(String dbname) {
        this.dbname = dbname == null ? null : dbname.trim();
    }

    public String getDatamemo() {
        return datamemo;
    }

    public void setDatamemo(String datamemo) {
        this.datamemo = datamemo == null ? null : datamemo.trim();
    }

    public Integer getHasrule() {
        return hasrule;
    }

    public void setHasrule(Integer hasrule) {
        this.hasrule = hasrule;
    }

    public String getViewsql() {
        return viewsql;
    }

    public void setViewsql(String viewsql) {
        this.viewsql = viewsql == null ? null : viewsql.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        DmpMeta other = (DmpMeta) that;
        return (this.getSysid() == null ? other.getSysid() == null : this.getSysid().equals(other.getSysid()))
            && (this.getStatusid() == null ? other.getStatusid() == null : this.getStatusid().equals(other.getStatusid()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getDeptid() == null ? other.getDeptid() == null : this.getDeptid().equals(other.getDeptid()))
            && (this.getDeptname() == null ? other.getDeptname() == null : this.getDeptname().equals(other.getDeptname()))
            && (this.getDatalevelid() == null ? other.getDatalevelid() == null : this.getDatalevelid().equals(other.getDatalevelid()))
            && (this.getDatalevelno() == null ? other.getDatalevelno() == null : this.getDatalevelno().equals(other.getDatalevelno()))
            && (this.getDatalevelname() == null ? other.getDatalevelname() == null : this.getDatalevelname().equals(other.getDatalevelname()))
            && (this.getCreatorid() == null ? other.getCreatorid() == null : this.getCreatorid().equals(other.getCreatorid()))
            && (this.getCreatorname() == null ? other.getCreatorname() == null : this.getCreatorname().equals(other.getCreatorname()))
            && (this.getCreateon() == null ? other.getCreateon() == null : this.getCreateon().equals(other.getCreateon()))
            && (this.getModifierid() == null ? other.getModifierid() == null : this.getModifierid().equals(other.getModifierid()))
            && (this.getModifiername() == null ? other.getModifiername() == null : this.getModifiername().equals(other.getModifiername()))
            && (this.getModifiedon() == null ? other.getModifiedon() == null : this.getModifiedon().equals(other.getModifiedon()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getOrderno() == null ? other.getOrderno() == null : this.getOrderno().equals(other.getOrderno()))
            && (this.getParentid() == null ? other.getParentid() == null : this.getParentid().equals(other.getParentid()))
            && (this.getIsleaf() == null ? other.getIsleaf() == null : this.getIsleaf().equals(other.getIsleaf()))
            && (this.getNamepath() == null ? other.getNamepath() == null : this.getNamepath().equals(other.getNamepath()))
            && (this.getMetano() == null ? other.getMetano() == null : this.getMetano().equals(other.getMetano()))
            && (this.getMetaname() == null ? other.getMetaname() == null : this.getMetaname().equals(other.getMetaname()))
            && (this.getIconno() == null ? other.getIconno() == null : this.getIconno().equals(other.getIconno()))
            && (this.getClassid() == null ? other.getClassid() == null : this.getClassid().equals(other.getClassid()))
            && (this.getClassname() == null ? other.getClassname() == null : this.getClassname().equals(other.getClassname()))
            && (this.getTabname() == null ? other.getTabname() == null : this.getTabname().equals(other.getTabname()))
            && (this.getIscreateid() == null ? other.getIscreateid() == null : this.getIscreateid().equals(other.getIscreateid()))
            && (this.getIscreate() == null ? other.getIscreate() == null : this.getIscreate().equals(other.getIscreate()))
            && (this.getDastid() == null ? other.getDastid() == null : this.getDastid().equals(other.getDastid()))
            && (this.getDbid() == null ? other.getDbid() == null : this.getDbid().equals(other.getDbid()))
            && (this.getDbname() == null ? other.getDbname() == null : this.getDbname().equals(other.getDbname()))
            && (this.getDatamemo() == null ? other.getDatamemo() == null : this.getDatamemo().equals(other.getDatamemo()))
            && (this.getHasrule() == null ? other.getHasrule() == null : this.getHasrule().equals(other.getHasrule()))
            && (this.getViewsql() == null ? other.getViewsql() == null : this.getViewsql().equals(other.getViewsql()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSysid() == null) ? 0 : getSysid().hashCode());
        result = prime * result + ((getStatusid() == null) ? 0 : getStatusid().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getDeptid() == null) ? 0 : getDeptid().hashCode());
        result = prime * result + ((getDeptname() == null) ? 0 : getDeptname().hashCode());
        result = prime * result + ((getDatalevelid() == null) ? 0 : getDatalevelid().hashCode());
        result = prime * result + ((getDatalevelno() == null) ? 0 : getDatalevelno().hashCode());
        result = prime * result + ((getDatalevelname() == null) ? 0 : getDatalevelname().hashCode());
        result = prime * result + ((getCreatorid() == null) ? 0 : getCreatorid().hashCode());
        result = prime * result + ((getCreatorname() == null) ? 0 : getCreatorname().hashCode());
        result = prime * result + ((getCreateon() == null) ? 0 : getCreateon().hashCode());
        result = prime * result + ((getModifierid() == null) ? 0 : getModifierid().hashCode());
        result = prime * result + ((getModifiername() == null) ? 0 : getModifiername().hashCode());
        result = prime * result + ((getModifiedon() == null) ? 0 : getModifiedon().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getOrderno() == null) ? 0 : getOrderno().hashCode());
        result = prime * result + ((getParentid() == null) ? 0 : getParentid().hashCode());
        result = prime * result + ((getIsleaf() == null) ? 0 : getIsleaf().hashCode());
        result = prime * result + ((getNamepath() == null) ? 0 : getNamepath().hashCode());
        result = prime * result + ((getMetano() == null) ? 0 : getMetano().hashCode());
        result = prime * result + ((getMetaname() == null) ? 0 : getMetaname().hashCode());
        result = prime * result + ((getIconno() == null) ? 0 : getIconno().hashCode());
        result = prime * result + ((getClassid() == null) ? 0 : getClassid().hashCode());
        result = prime * result + ((getClassname() == null) ? 0 : getClassname().hashCode());
        result = prime * result + ((getTabname() == null) ? 0 : getTabname().hashCode());
        result = prime * result + ((getIscreateid() == null) ? 0 : getIscreateid().hashCode());
        result = prime * result + ((getIscreate() == null) ? 0 : getIscreate().hashCode());
        result = prime * result + ((getDastid() == null) ? 0 : getDastid().hashCode());
        result = prime * result + ((getDbid() == null) ? 0 : getDbid().hashCode());
        result = prime * result + ((getDbname() == null) ? 0 : getDbname().hashCode());
        result = prime * result + ((getDatamemo() == null) ? 0 : getDatamemo().hashCode());
        result = prime * result + ((getHasrule() == null) ? 0 : getHasrule().hashCode());
        result = prime * result + ((getViewsql() == null) ? 0 : getViewsql().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sysid=").append(sysid);
        sb.append(", statusid=").append(statusid);
        sb.append(", status=").append(status);
        sb.append(", deptid=").append(deptid);
        sb.append(", deptname=").append(deptname);
        sb.append(", datalevelid=").append(datalevelid);
        sb.append(", datalevelno=").append(datalevelno);
        sb.append(", datalevelname=").append(datalevelname);
        sb.append(", creatorid=").append(creatorid);
        sb.append(", creatorname=").append(creatorname);
        sb.append(", createon=").append(createon);
        sb.append(", modifierid=").append(modifierid);
        sb.append(", modifiername=").append(modifiername);
        sb.append(", modifiedon=").append(modifiedon);
        sb.append(", remark=").append(remark);
        sb.append(", orderno=").append(orderno);
        sb.append(", parentid=").append(parentid);
        sb.append(", isleaf=").append(isleaf);
        sb.append(", namepath=").append(namepath);
        sb.append(", metano=").append(metano);
        sb.append(", metaname=").append(metaname);
        sb.append(", iconno=").append(iconno);
        sb.append(", classid=").append(classid);
        sb.append(", classname=").append(classname);
        sb.append(", tabname=").append(tabname);
        sb.append(", iscreateid=").append(iscreateid);
        sb.append(", iscreate=").append(iscreate);
        sb.append(", dastid=").append(dastid);
        sb.append(", dbid=").append(dbid);
        sb.append(", dbname=").append(dbname);
        sb.append(", datamemo=").append(datamemo);
        sb.append(", hasrule=").append(hasrule);
        sb.append(", viewsql=").append(viewsql);
        sb.append("]");
        return sb.toString();
    }
}