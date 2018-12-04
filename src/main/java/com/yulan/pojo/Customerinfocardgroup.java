package com.yulan.pojo;

import java.util.Date;

/**
 * 客户资料卡分组表
 */
public class Customerinfocardgroup {

    private String Id;
    private String area_code;
    private String area_district;
    private String customer_type;
    private String descp;
    private Date createts;
    private int cardcount;
    private int contractyear;
    private int deleted;
    private int erpcopyed;
    private String area_codeName;//市场名
    private String area_districtName;//区域名
    private String customer_typeName;//客户类型名

    public String getArea_codeName() {
        return area_codeName;
    }

    public Customerinfocardgroup() {
    }

    public void setArea_codeName(String area_codeName) {
        this.area_codeName = area_codeName;
    }

    public String getArea_districtName() {
        return area_districtName;
    }

    public void setArea_districtName(String area_districtName) {
        this.area_districtName = area_districtName;
    }

    public String getCustomer_typeName() {
        return customer_typeName;
    }

    public void setCustomer_typeName(String customer_typeName) {
        this.customer_typeName = customer_typeName;
    }

    public Customerinfocardgroup(String id, String area_code, String area_district, String customer_type, String descp, Date createts, int cardcount, int contractyear, int deleted, int erpcopyed) {
        Id = id;
        this.area_code = area_code;
        this.area_district = area_district;
        this.customer_type = customer_type;
        this.descp = descp;
        this.createts = createts;
        this.cardcount = cardcount;
        this.contractyear = contractyear;
        this.deleted = deleted;
        this.erpcopyed = erpcopyed;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getArea_code() {
        return area_code;
    }

    public void setArea_code(String area_code) {
        this.area_code = area_code;
    }

    public String getArea_district() {
        return area_district;
    }

    public void setArea_district(String area_district) {
        this.area_district = area_district;
    }

    public String getCustomer_type() {
        return customer_type;
    }

    public void setCustomer_type(String customer_type) {
        this.customer_type = customer_type;
    }

    public String getDescp() {
        return descp;
    }

    public void setDescp(String descp) {
        this.descp = descp;
    }

    public Date getCreatets() {
        return createts;
    }

    public void setCreatets(Date createts) {
        this.createts = createts;
    }

    public int getCardcount() {
        return cardcount;
    }

    public void setCardcount(int cardcount) {
        this.cardcount = cardcount;
    }

    public int getContractyear() {
        return contractyear;
    }

    public void setContractyear(int contractyear) {
        this.contractyear = contractyear;
    }

    public int getDeleted() {
        return deleted;
    }

    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }

    public int getErpcopyed() {
        return erpcopyed;
    }

    public void setErpcopyed(int erpcopyed) {
        this.erpcopyed = erpcopyed;
    }
}
