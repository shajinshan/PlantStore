package com.ryncoorchids.ryncoOrchids.model;

import com.ryncoorchids.ryncoOrchids.entity.UserData;

public class OrderDataModel {

    private String plantName;
    private String img;


    public OrderDataModel(String plantName,String img) {
        this.plantName = plantName;
        this.img = img;
    }

    public OrderDataModel() {
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getPlantName() {
        return plantName;
    }

    public void setPlantName(String plantName) {
        this.plantName = plantName;
    }


}
