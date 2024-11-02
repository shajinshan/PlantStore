package com.ryncoorchids.ryncoOrchids.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "admin")
public class AdminData {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "admin_name")
    String adminName;

    @Column(name = "password")
    String password;

    public AdminData(String adminName, String password) {
        this.adminName = adminName;
        this.password = password;
    }

    public AdminData() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
