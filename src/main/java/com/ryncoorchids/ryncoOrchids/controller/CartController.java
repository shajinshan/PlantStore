package com.ryncoorchids.ryncoOrchids.controller;

import com.ryncoorchids.ryncoOrchids.entity.PlantCart;
import com.ryncoorchids.ryncoOrchids.exception.ProductException;
import com.ryncoorchids.ryncoOrchids.model.PlantCartModel;
import com.ryncoorchids.ryncoOrchids.service.CartService;
import com.ryncoorchids.ryncoOrchids.util.ResponseHandle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cartfun")
@CrossOrigin
public class CartController {

    @Autowired
    CartService cartService;

    //Add to cart by user id
    @PostMapping("cart/addCart/{userId}")
    public ResponseEntity<?> addCart(@PathVariable Long userId, @RequestBody PlantCartModel plantCartModel){
        try {
            cartService.addCartPlat(userId,plantCartModel);

            return ResponseHandle.registrationResponse(HttpStatus.OK,"success",null);

        }catch (ProductException p){
            return ResponseHandle.registrationResponse(HttpStatus.BAD_REQUEST,"failed",p.getError());
        }
    }


    // Fetch all in Cart by user id
    @GetMapping("cart/readAllByUserId/{userId}")
    public List<PlantCart> allCart(@PathVariable("userId") Long userId){
        return cartService.allCartById(userId);
    }


    //Delete cart item by id
    @DeleteMapping("cart/delete/{id}")
    public String deletecart(@PathVariable("id")  Long id){
        cartService.deleteCart(id);
        return "deleted";
    }


    //View cart item by id
    @GetMapping("/cart/view/{id}")
    public PlantCart viewCartItem(@PathVariable("id") Long id){
        return cartService.viewCartitem(id);
    }
}
