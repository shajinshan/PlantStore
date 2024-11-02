package com.ryncoorchids.ryncoOrchids.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "order_data")
public class OrderData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private  Long id;

    @Column(name = "plantName")
    private String plantName;

    @Column(name = "date")
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserData user;

    @Column(name = "imgLink")
    private String img;

    public OrderData(String plantName, LocalDate date, UserData user,String img) {
        this.plantName = plantName;
        this.date = date;
        this.user = user;
        this.img=img;

    }

    public OrderData() {
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

    public String getPlantName() {
        return plantName;
    }

    public void setPlantName(String plantName) {
        this.plantName = plantName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public UserData getUser() {
        return user;
    }

    public void setUser(UserData user) {
        this.user = user;
    }
}
