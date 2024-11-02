package com.ryncoorchids.ryncoOrchids.controller;

import com.ryncoorchids.ryncoOrchids.entity.OrderDetails;
import com.ryncoorchids.ryncoOrchids.exception.ProductException;
import com.ryncoorchids.ryncoOrchids.model.OrderDetailModel;
import com.ryncoorchids.ryncoOrchids.service.OrderDetailService;
import com.ryncoorchids.ryncoOrchids.util.ResponseHandle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("order")
@CrossOrigin
public class OrderDetailController {

    @Autowired
    OrderDetailService orderDetailService;

    @PostMapping("/addDetails")
    public ResponseEntity<?> addOrderDetails(@RequestBody OrderDetailModel orderDetailModel){

        try {
            orderDetailService.addOrderDetail(orderDetailModel);
            return ResponseHandle.registrationResponse(HttpStatus.OK, "added", null);
        }catch (ProductException p){
            return ResponseHandle.registrationResponse(HttpStatus.BAD_REQUEST, "Failed", p.getError());
        }
    }

    @GetMapping("/view/{plantid}")
    public OrderDetails viewById(@PathVariable("plantid") Long plantid){

        return orderDetailService.viewById(plantid);
    }

    @GetMapping("/showallorderdetail")
    public List<OrderDetails>readAll(){
        return orderDetailService.readAllorderData();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?>deleteOderDetail(@PathVariable("id") Long id){
        try {
            orderDetailService.deleteOrderDetail(id);
            return ResponseHandle.registrationResponse(HttpStatus.OK,"success",null);
        }catch (ProductException p){
            return ResponseHandle.registrationResponse(HttpStatus.BAD_REQUEST,"failed to delete",p.getError());
        }
    }
}
