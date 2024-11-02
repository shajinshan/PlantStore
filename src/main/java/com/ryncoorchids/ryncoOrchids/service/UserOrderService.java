package com.ryncoorchids.ryncoOrchids.service;

import com.ryncoorchids.ryncoOrchids.entity.OrderData;
import com.ryncoorchids.ryncoOrchids.entity.UserData;
import com.ryncoorchids.ryncoOrchids.exception.ProductException;
import com.ryncoorchids.ryncoOrchids.model.OrderDataModel;
import com.ryncoorchids.ryncoOrchids.repository.OrderDetailRepository;
import com.ryncoorchids.ryncoOrchids.repository.UserDataRepository;
import com.ryncoorchids.ryncoOrchids.repository.UserOrderRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Service
public class UserOrderService {

    @Autowired
    UserOrderRepositoty userOrderRepository;

    @Autowired
    UserDataRepository userDataRepository;

    public void addUserOrderData(Long userId, OrderDataModel orderDataModel) throws ProductException {

        List<String>error=new ArrayList<>();
        UserData user = userDataRepository.findById(userId)
                .orElseThrow(() -> new ProductException(error, "User not found"));

        OrderData orderData = new OrderData();
        orderData.setPlantName(orderDataModel.getPlantName());
        orderData.setImg(orderDataModel.getImg());
        orderData.setUser(user);
        orderData.setDate(LocalDate.now());

        userOrderRepository.save(orderData);
    }

    public List<OrderData> findOrderByUser(Long userId) {
        List<String> error = new ArrayList<>();
        error.add("User not found");

        UserData user = userDataRepository.findById(userId)
                .orElseThrow(() -> new ProductException(error, "User not found"));

        return userOrderRepository.findByUser(user);
    }
}
