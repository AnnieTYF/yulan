package com.yulan.pojo;

public class Webcontractwfmember {
    private String roleId;
    private int cYear;
    private String wfUserId;
    private String bindUserName;
    private int disabled;

    public Webcontractwfmember(String roleId, int cYear, String wfUserId, String bindUserName, int disabled) {
        this.roleId = roleId;
        this.cYear = cYear;
        this.wfUserId = wfUserId;
        this.bindUserName = bindUserName;
        this.disabled = disabled;
    }

    public String getRoleId() {
        return roleId;
    }

    public Webcontractwfmember() {
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public int getcYear() {
        return cYear;
    }

    public void setcYear(int cYear) {
        this.cYear = cYear;
    }

    public String getWfUserId() {
        return wfUserId;
    }

    public void setWfUserId(String wfUserId) {
        this.wfUserId = wfUserId;
    }

    public String getBindUserName() {
        return bindUserName;
    }

    public void setBindUserName(String bindUserName) {
        this.bindUserName = bindUserName;
    }

    public int getDisabled() {
        return disabled;
    }

    public void setDisabled(int disabled) {
        this.disabled = disabled;
    }
}