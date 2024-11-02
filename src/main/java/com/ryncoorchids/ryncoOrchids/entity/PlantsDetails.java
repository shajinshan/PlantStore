package com.ryncoorchids.ryncoOrchids.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "products_data")
public class PlantsDetails {


    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_name")
    private  String productName;

    @Column(name = "category")
    private  String category;

    @Column(name = "price")
    private  Long price;

    @Column(name = "date")
    private LocalDate date;

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Column(name="img")
private String img;


    @Column(name = "description")
    private  String description;

    public PlantsDetails() {
    }

    public PlantsDetails(String productName, String category, Long price, String description,String img,LocalDate date) {
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.description = description;
        this.img=img;
        this.date=date;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
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

    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }
}
