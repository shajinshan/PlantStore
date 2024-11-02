package com.ryncoorchids.ryncoOrchids.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "order_details")
public class OrderDetails {

    @Id
    @Column(name = "orderId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "name")
    String name;

    @Column(name = "pincode")
    String pincode;

    @Column(name = "phone")
    String phone;

    @Column(name = "mail")
    String mail;

    @Column(name = "address")
    String address;

    @Column(name = "district")
    String district;

    @Column(name = "state")
    String state;

    @Column(name = "landmark")
    String landmark;

    @Column(name = "alterPhoneNumber")
    String alterPhoneNumber;


    @Column(name = "plantid")
    Long plantid;

    @Column(name = "plantName")
    String plantName;

    @Column(name = "price")
    String price;

    @Column(name = "category")
    String category;

    @Column(name = "img")
    String img;


    public OrderDetails(String name, String pincode, String phone, String mail, String address, String district, String state, String landmark, String alterPhoneNumber, Long plantid, String plantName, String price, String category, String img) {
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

    public OrderDetails() {
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Long getPlantid() {
        return plantid;
    }

    public void setPlantid(Long plantid) {
        this.plantid = plantid;
    }

    public void setCategory(String category) {
        this.category = category;
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
