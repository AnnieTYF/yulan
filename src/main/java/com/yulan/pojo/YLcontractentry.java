package com.yulan.pojo;
/*
*网签协议表
 */


import java.util.Date;

public class YLcontractentry {

    private Short cyear;

    private String cid;

    private String cname;

    private String xDistrict;

    private String xAreaDistrict2;

    private String xAreaDistrict3;

    private java.util.Date startDate;

    private java.util.Date endDate;

    private String typeid;

    private String tablename;

    private String pagename;

    private String state;

    private String wfmemo;

    private String aOwner;

    private java.util.Date signts;

    private Short signed;

    private Short legalchecked;

    private String rwUpdate;

    public Short getCyear() {
        return cyear;
    }

    public void setCyear(Short cyear) {
        this.cyear = cyear;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getxDistrict() {
        return xDistrict;
    }

    public void setxDistrict(String xDistrict) {
        this.xDistrict = xDistrict == null ? null : xDistrict.trim();
    }

    public String getxAreaDistrict2() {
        return xAreaDistrict2;
    }

    public void setxAreaDistrict2(String xAreaDistrict2) {
        this.xAreaDistrict2 = xAreaDistrict2 == null ? null : xAreaDistrict2.trim();
    }

    public String getxAreaDistrict3() {
        return xAreaDistrict3;
    }

    public void setxAreaDistrict3(String xAreaDistrict3) {
        this.xAreaDistrict3 = xAreaDistrict3 == null ? null : xAreaDistrict3.trim();
    }

    public java.util.Date getStartDate() {
        return startDate;
    }

    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }

    public java.util.Date getEndDate() {
        return endDate;
    }

    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
    }

    public String getTypeid() {
        return typeid;
    }

    public void setTypeid(String typeid) {
        this.typeid = typeid == null ? null : typeid.trim();
    }

    public String getTablename() {
        return tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename == null ? null : tablename.trim();
    }

    public String getPagename() {
        return pagename;
    }

    public void setPagename(String pagename) {
        this.pagename = pagename == null ? null : pagename.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getWfmemo() {
        return wfmemo;
    }

    public void setWfmemo(String wfmemo) {
        this.wfmemo = wfmemo == null ? null : wfmemo.trim();
    }

    public String getaOwner() {
        return aOwner;
    }

    public void setaOwner(String aOwner) {
        this.aOwner = aOwner == null ? null : aOwner.trim();
    }

    public java.util.Date getSignts() {
        return signts;
    }

    public void setSignts(Date signts) {
        this.signts = signts;
    }

    public Short getSigned() {
        return signed;
    }

    public void setSigned(Short signed) {
        this.signed = signed;
    }

    public Short getLegalchecked() {
        return legalchecked;
    }

    public void setLegalchecked(Short legalchecked) {
        this.legalchecked = legalchecked;
    }

    public String getRwUpdate() {
        return rwUpdate;
    }

    public void setRwUpdate(String rwUpdate) {
        this.rwUpdate = rwUpdate == null ? null : rwUpdate.trim();
    }

    @Override
    public String toString() {
        return "YLcontractentry{" +
                "cyear=" + cyear +
                ", cid='" + cid + '\'' +
                ", cname='" + cname + '\'' +
                ", xDistrict='" + xDistrict + '\'' +
                ", xAreaDistrict2='" + xAreaDistrict2 + '\'' +
                ", xAreaDistrict3='" + xAreaDistrict3 + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", typeid='" + typeid + '\'' +
                ", tablename='" + tablename + '\'' +
                ", pagename='" + pagename + '\'' +
                ", state='" + state + '\'' +
                ", wfmemo='" + wfmemo + '\'' +
                ", aOwner='" + aOwner + '\'' +
                ", signts=" + signts +
                ", signed=" + signed +
                ", legalchecked=" + legalchecked +
                ", rwUpdate='" + rwUpdate + '\'' +
                '}';
    }
}
