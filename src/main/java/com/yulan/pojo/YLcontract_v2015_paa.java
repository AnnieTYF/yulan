package com.yulan.pojo;
/*
*委托账号信息
 */
public class YLcontract_v2015_paa {

    private Integer ccyear;

    private String ccid;

    private String name;

    private String accountBank;

    private String accout;

    private String accountLocation;

    private String authfileIamge;

    private String idcardIamge1;

    private String idcardIamge2;

    private String idcardNo;

    public Integer getCcyear() {
        return ccyear;
    }

    public void setCcyear(Integer ccyear) {
        this.ccyear = ccyear;
    }

    public String getCcid() {
        return ccid;
    }

    public void setCcid(String ccid) {
        this.ccid = ccid == null ? null : ccid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAccountBank() {
        return accountBank;
    }

    public void setAccountBank(String accountBank) {
        this.accountBank = accountBank == null ? null : accountBank.trim();
    }

    public String getAccout() {
        return accout;
    }

    public void setAccout(String accout) {
        this.accout = accout == null ? null : accout.trim();
    }

    public String getAccountLocation() {
        return accountLocation;
    }

    public void setAccountLocation(String accountLocation) {
        this.accountLocation = accountLocation == null ? null : accountLocation.trim();
    }

    public String getAuthfileIamge() {
        return authfileIamge;
    }

    public void setAuthfileIamge(String authfileIamge) {
        this.authfileIamge = authfileIamge == null ? null : authfileIamge.trim();
    }

    public String getIdcardIamge1() {
        return idcardIamge1;
    }

    public void setIdcardIamge1(String idcardIamge1) {
        this.idcardIamge1 = idcardIamge1 == null ? null : idcardIamge1.trim();
    }

    public String getIdcardIamge2() {
        return idcardIamge2;
    }

    public void setIdcardIamge2(String idcardIamge2) {
        this.idcardIamge2 = idcardIamge2 == null ? null : idcardIamge2.trim();
    }

    public String getIdcardNo() {
        return idcardNo;
    }

    public void setIdcardNo(String idcardNo) {
        this.idcardNo = idcardNo == null ? null : idcardNo.trim();
    }

    public YLcontract_v2015_paa(Integer ccyear, String ccid,String name,String accountBank) {
        this.ccyear = ccyear;
        this.ccid = ccid;
        this.name = name;
        this.accountBank = accountBank;
    }

    public YLcontract_v2015_paa() {
    }

    @Override
    public String toString() {
        return "YLcontract_v2015_paa{" +
                "ccyear=" + ccyear +
                ", ccid='" + ccid + '\'' +
                ", name='" + name + '\'' +
                ", accountBank='" + accountBank + '\'' +
                ", accout='" + accout + '\'' +
                ", accountLocation='" + accountLocation + '\'' +
                ", authfileIamge='" + authfileIamge + '\'' +
                ", idcardIamge1='" + idcardIamge1 + '\'' +
                ", idcardIamge2='" + idcardIamge2 + '\'' +
                ", idcardNo='" + idcardNo + '\'' +
                '}';
    }
}
