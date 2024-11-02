package com.ryncoorchids.ryncoOrchids.model;

public class AdminDataModel {

    String adminName;
    String password;

    public AdminDataModel() {
    }

    public AdminDataModel(String adminName, String password) {
        this.adminName = adminName;
        this.password = password;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
