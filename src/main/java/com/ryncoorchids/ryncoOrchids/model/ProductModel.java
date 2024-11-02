package com.ryncoorchids.ryncoOrchids.model;

import java.time.LocalDate;

public class ProductModel {

    private String productName;
    private  String category;
    private  String description;
    private  Long price;
    private String img;
    private LocalDate date;

    public ProductModel() {
    }

    public ProductModel(String productName, String category, String description, Long price,String img,LocalDate date) {
        this.productName = productName;
        this.category = category;
        this.description = description;
        this.price = price;
        this.img=img;
        this.date=date;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
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
}
