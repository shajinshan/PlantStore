package com.ryncoorchids.ryncoOrchids.model;

public class UserDataLoginModel {

    String gmail;
    String password;

    public UserDataLoginModel(String gmail, String password) {
        this.gmail = gmail;
        this.password = password;
    }

    public UserDataLoginModel() {
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
