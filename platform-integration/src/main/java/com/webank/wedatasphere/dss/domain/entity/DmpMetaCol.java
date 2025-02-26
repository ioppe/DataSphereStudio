package com.webank.wedatasphere.dss.domain.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class DmpMetaCol implements Serializable {
    private static final long serialVersionUID = 1L;
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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createon;
    private String modifierid;
    private String modifiername;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date modifiedon;
    private String remark;
    private String orderno;
    private String metaid;
    private String metaname;
    private String tabname;
    private String colname;
    private String coltitle;
    private String coldes;
    private String canemptyid;
    private String canempty;
    private String coltypeid;
    private String coltype;
    private String coldbtype;
    private Integer collen;
    private Integer colacc;
    private String ruleid;
    private String rulename;
    private String isfilterid;
    private String isfilter;
    private Integer width;
    private String ispkid;
    private String ispk;

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

    public String getMetaid() {
        return metaid;
    }

    public void setMetaid(String metaid) {
        this.metaid = metaid == null ? null : metaid.trim();
    }

    public String getMetaname() {
        return metaname;
    }

    public void setMetaname(String metaname) {
        this.metaname = metaname == null ? null : metaname.trim();
    }

    public String getTabname() {
        return tabname;
    }

    public void setTabname(String tabname) {
        this.tabname = tabname == null ? null : tabname.trim();
    }

    public String getColname() {
        return colname;
    }

    public void setColname(String colname) {
        this.colname = colname == null ? null : colname.trim();
    }

    public String getColtitle() {
        return coltitle;
    }

    public void setColtitle(String coltitle) {
        this.coltitle = coltitle == null ? null : coltitle.trim();
    }

    public String getColdes() {
        return coldes;
    }

    public void setColdes(String coldes) {
        this.coldes = coldes == null ? null : coldes.trim();
    }

    public String getCanemptyid() {
        return canemptyid;
    }

    public void setCanemptyid(String canemptyid) {
        this.canemptyid = canemptyid == null ? null : canemptyid.trim();
    }

    public String getCanempty() {
        return canempty;
    }

    public void setCanempty(String canempty) {
        this.canempty = canempty == null ? null : canempty.trim();
    }

    public String getColtypeid() {
        return coltypeid;
    }

    public void setColtypeid(String coltypeid) {
        this.coltypeid = coltypeid == null ? null : coltypeid.trim();
    }

    public String getColtype() {
        return coltype;
    }

    public void setColtype(String coltype) {
        this.coltype = coltype == null ? null : coltype.trim();
    }

    public String getColdbtype() {
        return coldbtype;
    }

    public void setColdbtype(String coldbtype) {
        this.coldbtype = coldbtype == null ? null : coldbtype.trim();
    }

    public Integer getCollen() {
        return collen;
    }

    public void setCollen(Integer collen) {
        this.collen = collen;
    }

    public Integer getColacc() {
        return colacc;
    }

    public void setColacc(Integer colacc) {
        this.colacc = colacc;
    }

    public String getRuleid() {
        return ruleid;
    }

    public void setRuleid(String ruleid) {
        this.ruleid = ruleid == null ? null : ruleid.trim();
    }

    public String getRulename() {
        return rulename;
    }

    public void setRulename(String rulename) {
        this.rulename = rulename == null ? null : rulename.trim();
    }

    public String getIsfilterid() {
        return isfilterid;
    }

    public void setIsfilterid(String isfilterid) {
        this.isfilterid = isfilterid == null ? null : isfilterid.trim();
    }

    public String getIsfilter() {
        return isfilter;
    }

    public void setIsfilter(String isfilter) {
        this.isfilter = isfilter == null ? null : isfilter.trim();
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public String getIspkid() {
        return ispkid;
    }

    public void setIspkid(String ispkid) {
        this.ispkid = ispkid == null ? null : ispkid.trim();
    }

    public String getIspk() {
        return ispk;
    }

    public void setIspk(String ispk) {
        this.ispk = ispk == null ? null : ispk.trim();
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
        DmpMetaCol other = (DmpMetaCol) that;
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
                && (this.getMetaid() == null ? other.getMetaid() == null : this.getMetaid().equals(other.getMetaid()))
                && (this.getMetaname() == null ? other.getMetaname() == null : this.getMetaname().equals(other.getMetaname()))
                && (this.getTabname() == null ? other.getTabname() == null : this.getTabname().equals(other.getTabname()))
                && (this.getColname() == null ? other.getColname() == null : this.getColname().equals(other.getColname()))
                && (this.getColtitle() == null ? other.getColtitle() == null : this.getColtitle().equals(other.getColtitle()))
                && (this.getColdes() == null ? other.getColdes() == null : this.getColdes().equals(other.getColdes()))
                && (this.getCanemptyid() == null ? other.getCanemptyid() == null : this.getCanemptyid().equals(other.getCanemptyid()))
                && (this.getCanempty() == null ? other.getCanempty() == null : this.getCanempty().equals(other.getCanempty()))
                && (this.getColtypeid() == null ? other.getColtypeid() == null : this.getColtypeid().equals(other.getColtypeid()))
                && (this.getColtype() == null ? other.getColtype() == null : this.getColtype().equals(other.getColtype()))
                && (this.getColdbtype() == null ? other.getColdbtype() == null : this.getColdbtype().equals(other.getColdbtype()))
                && (this.getCollen() == null ? other.getCollen() == null : this.getCollen().equals(other.getCollen()))
                && (this.getColacc() == null ? other.getColacc() == null : this.getColacc().equals(other.getColacc()))
                && (this.getRuleid() == null ? other.getRuleid() == null : this.getRuleid().equals(other.getRuleid()))
                && (this.getRulename() == null ? other.getRulename() == null : this.getRulename().equals(other.getRulename()))
                && (this.getIsfilterid() == null ? other.getIsfilterid() == null : this.getIsfilterid().equals(other.getIsfilterid()))
                && (this.getIsfilter() == null ? other.getIsfilter() == null : this.getIsfilter().equals(other.getIsfilter()))
                && (this.getWidth() == null ? other.getWidth() == null : this.getWidth().equals(other.getWidth()))
                && (this.getIspkid() == null ? other.getIspkid() == null : this.getIspkid().equals(other.getIspkid()))
                && (this.getIspk() == null ? other.getIspk() == null : this.getIspk().equals(other.getIspk()));
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
        result = prime * result + ((getMetaid() == null) ? 0 : getMetaid().hashCode());
        result = prime * result + ((getMetaname() == null) ? 0 : getMetaname().hashCode());
        result = prime * result + ((getTabname() == null) ? 0 : getTabname().hashCode());
        result = prime * result + ((getColname() == null) ? 0 : getColname().hashCode());
        result = prime * result + ((getColtitle() == null) ? 0 : getColtitle().hashCode());
        result = prime * result + ((getColdes() == null) ? 0 : getColdes().hashCode());
        result = prime * result + ((getCanemptyid() == null) ? 0 : getCanemptyid().hashCode());
        result = prime * result + ((getCanempty() == null) ? 0 : getCanempty().hashCode());
        result = prime * result + ((getColtypeid() == null) ? 0 : getColtypeid().hashCode());
        result = prime * result + ((getColtype() == null) ? 0 : getColtype().hashCode());
        result = prime * result + ((getColdbtype() == null) ? 0 : getColdbtype().hashCode());
        result = prime * result + ((getCollen() == null) ? 0 : getCollen().hashCode());
        result = prime * result + ((getColacc() == null) ? 0 : getColacc().hashCode());
        result = prime * result + ((getRuleid() == null) ? 0 : getRuleid().hashCode());
        result = prime * result + ((getRulename() == null) ? 0 : getRulename().hashCode());
        result = prime * result + ((getIsfilterid() == null) ? 0 : getIsfilterid().hashCode());
        result = prime * result + ((getIsfilter() == null) ? 0 : getIsfilter().hashCode());
        result = prime * result + ((getWidth() == null) ? 0 : getWidth().hashCode());
        result = prime * result + ((getIspkid() == null) ? 0 : getIspkid().hashCode());
        result = prime * result + ((getIspk() == null) ? 0 : getIspk().hashCode());
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
        sb.append(", metaid=").append(metaid);
        sb.append(", metaname=").append(metaname);
        sb.append(", tabname=").append(tabname);
        sb.append(", colname=").append(colname);
        sb.append(", coltitle=").append(coltitle);
        sb.append(", coldes=").append(coldes);
        sb.append(", canemptyid=").append(canemptyid);
        sb.append(", canempty=").append(canempty);
        sb.append(", coltypeid=").append(coltypeid);
        sb.append(", coltype=").append(coltype);
        sb.append(", coldbtype=").append(coldbtype);
        sb.append(", collen=").append(collen);
        sb.append(", colacc=").append(colacc);
        sb.append(", ruleid=").append(ruleid);
        sb.append(", rulename=").append(rulename);
        sb.append(", isfilterid=").append(isfilterid);
        sb.append(", isfilter=").append(isfilter);
        sb.append(", width=").append(width);
        sb.append(", ispkid=").append(ispkid);
        sb.append(", ispk=").append(ispk);
        sb.append("]");
        return sb.toString();
    }
}