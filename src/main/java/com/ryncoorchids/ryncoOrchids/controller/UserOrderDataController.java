package com.ryncoorchids.ryncoOrchids.controller;

import com.ryncoorchids.ryncoOrchids.entity.OrderData;
import com.ryncoorchids.ryncoOrchids.exception.ProductException;
import com.ryncoorchids.ryncoOrchids.model.OrderDataModel;
import com.ryncoorchids.ryncoOrchids.service.UserOrderService;
import com.ryncoorchids.ryncoOrchids.util.ResponseHandle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("userOrder")
@CrossOrigin
public class UserOrderDataController {

    @Autowired
    UserOrderService userOrderService;

    @PostMapping("/addOrder/{userId}")
    public ResponseEntity<?> addUserOrder(@PathVariable("userId") Long userId, @RequestBody OrderDataModel orderDataModel){
        try {
            userOrderService.addUserOrderData(userId,orderDataModel);
            return ResponseHandle.registrationResponse(HttpStatus.OK, "ok", null);
        }catch (ProductException p){
            return ResponseHandle.registrationResponse(HttpStatus.BAD_REQUEST, "Failed", p.getError());
        }
    }
    @GetMapping("/readAllOrder/{userId}")
    public List<OrderData> showAllUserOrder(@PathVariable("userId") Long userId){
        return userOrderService.findOrderByUser(userId);
    }
}
