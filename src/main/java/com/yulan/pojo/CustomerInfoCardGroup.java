package com.yulan.pojo;

import java.sql.Date;

public class CustomerInfoCardGroup {

    private String ID;
    private String areaCode;
    private String areaDistrict;
    private String customerType;
    private String descp;
    private Date createts;
    private Integer cardCount;
    private Integer contractYear;
    private Integer deleted;
    private Integer erpCopyed;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getAreaDistrict() {
        return areaDistrict;
    }

    public void setAreaDistrict(String areaDistrict) {
        this.areaDistrict = areaDistrict;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
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

    public Integer getCardCount() {
        return cardCount;
    }

    public void setCardCount(Integer cardCount) {
        this.cardCount = cardCount;
    }

    public Integer getContractYear() {
        return contractYear;
    }

    public void setContractYear(Integer contractYear) {
        this.contractYear = contractYear;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public Integer getErpCopyed() {
        return erpCopyed;
    }

    public void setErpCopyed(Integer erpCopyed) {
        this.erpCopyed = erpCopyed;
    }
}
