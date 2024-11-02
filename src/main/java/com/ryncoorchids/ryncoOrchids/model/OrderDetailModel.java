package com.ryncoorchids.ryncoOrchids.model;

import jakarta.persistence.Column;

public class OrderDetailModel {
    String name;
    String pincode;
    String phone;
    String mail;
    String address;
    String district;
    String state;
    String landmark;
    String alterPhoneNumber;
    Long plantid;
    String plantName;
    String price;
    String category;
    String img;

    public OrderDetailModel(String name, String pincode, String phone, String mail, String address, String district, String state, String landmark, String alterPhoneNumber, Long plantid, String plantName, String price, String category,String img) {
        this.name = name;
        this.pincode = pincode;
        this.phone = phone;
        this.mail = mail;
        this.address = address;
        this.district = district;
        this.state = state;
        this.landmark = landmark;
        this.alterPhoneNumber = alterPhoneNumber;
        this.plantid = plantid;
        this.plantName = plantName;
        this.price = price;
        this.category = category;
        this.img=img;
    }

    public OrderDetailModel() {
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPlantid() {
        return plantid;
    }

    public void setPlantid(Long plantid) {
        this.plantid = plantid;
    }

    public String getPlantName() {
        return plantName;
    }

    public void setPlantName(String plantName) {
        this.plantName = plantName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getAlterPhoneNumber() {
        return alterPhoneNumber;
    }

    public void setAlterPhoneNumber(String alterPhoneNumber) {
        this.alterPhoneNumber = alterPhoneNumber;
    }
}
