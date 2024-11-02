package com.ryncoorchids.ryncoOrchids.model;

public class UserDataModel {

    String gmail;
    String phone;
    String password;

    public UserDataModel(String gmail, String phone, String password) {
        this.gmail = gmail;
        this.phone = phone;
        this.password = password;
    }

    public UserDataModel() {
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
