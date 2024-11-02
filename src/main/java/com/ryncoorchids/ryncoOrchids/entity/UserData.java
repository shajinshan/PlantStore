package com.ryncoorchids.ryncoOrchids.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user_data")
public class UserData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    Long id;


    @Column(name = "gmail")
    String gmail;


    @Column(name = "phone")
    String phone;


    @Column(name = "password")
    String password;

    public UserData(String gmail, String phone, String password) {
        this.gmail = gmail;
        this.phone = phone;
        this.password = password;
    }

    public UserData() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
