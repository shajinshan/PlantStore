package com.ryncoorchids.ryncoOrchids.model;

import com.ryncoorchids.ryncoOrchids.entity.UserData;

import java.time.LocalDate;

public class PlantCartModel {

    private String productName;
    private  String category;
    private  String description;
    private  Long price;
    private String img;
    private UserData user;
    private Long productId;



    public PlantCartModel( String productName, String category, String description, Long price, String img,Long productId) {

        this.productName = productName;
        this.category = category;
        this.description = description;
        this.price = price;
        this.img = img;
        this.productId=productId;

    }

    public PlantCartModel() {

    }


    public UserData getUser() {
        return user;
    }

    public void setUser(UserData user) {
        this.user = user;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
