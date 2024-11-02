package com.ryncoorchids.ryncoOrchids.repository;

import com.ryncoorchids.ryncoOrchids.entity.OrderData;
import com.ryncoorchids.ryncoOrchids.entity.OrderDetails;
import com.ryncoorchids.ryncoOrchids.entity.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetails, Long> {


    @Query(value = "SELECT o FROM OrderDetails o WHERE o.plantid = :plantid")
    OrderDetails customFindById(@Param("plantid") Long plantid);


}

