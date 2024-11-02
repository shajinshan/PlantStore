package com.ryncoorchids.ryncoOrchids.repository;

import com.ryncoorchids.ryncoOrchids.entity.PlantCart;
import com.ryncoorchids.ryncoOrchids.entity.UserData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartRepositoty extends JpaRepository<PlantCart,Long> {

    List<PlantCart> findByUser(UserData user);
}
