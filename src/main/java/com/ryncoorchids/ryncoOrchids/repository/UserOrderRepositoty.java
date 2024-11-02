package com.ryncoorchids.ryncoOrchids.repository;

import com.ryncoorchids.ryncoOrchids.entity.OrderData;

import com.ryncoorchids.ryncoOrchids.entity.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserOrderRepositoty extends JpaRepository<OrderData,Long> {

    List<OrderData> findByUser(UserData user);
}
