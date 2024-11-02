package com.ryncoorchids.ryncoOrchids.entity;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name ="plant_cart" )
public class PlantCart {


    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_name")
    private  String productName;

    @Column(name = "product_id")
    private Long productId;

    @Column(name = "category")
    private  String category;

    @Column(name = "price")
    private  Long price;



    @Column(name="img")
    private String img;


    @Column(name = "description")
    private  String description;

    @Column(name = "date")
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserData user;


    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
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

    public Long getPrice() {
        return price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public UserData getUser() {
        return user;
    }

    public void setUser(UserData user) {
        this.user = user;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }

    public PlantCart(String productName, String category, Long price, String img, String description,LocalDate date,UserData user,Long productId) {

        this.productName = productName;
        this.category = category;
        this.price = price;
        this.img = img;
        this.description = description;
        this.date=date;
        this.user=user;
        this.productId=productId;
    }

    public PlantCart() {
    }
}
