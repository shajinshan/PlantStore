package com.ryncoorchids.ryncoOrchids.controller;


import com.ryncoorchids.ryncoOrchids.entity.UserData;
import com.ryncoorchids.ryncoOrchids.exception.ProductException;
import com.ryncoorchids.ryncoOrchids.model.UserDataLoginModel;
import com.ryncoorchids.ryncoOrchids.model.UserDataModel;
import com.ryncoorchids.ryncoOrchids.service.UserService;
import com.ryncoorchids.ryncoOrchids.util.ResponseHandle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("user")
@CrossOrigin
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/register")
    public ResponseEntity<?> addNewUser(@RequestBody  UserDataModel userDataModel){
        try {
            userService.addNewUser(userDataModel);
            return ResponseHandle.registrationResponse(HttpStatus.OK,"success",null);
        }catch (ProductException p){
            return ResponseHandle.registrationResponse(HttpStatus.BAD_REQUEST,"failed",p.getError());
        }
    }


    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody UserDataLoginModel userDataLoginModel) {
        try {
            UserData user = userService.loginUser(userDataLoginModel);  // Retrieve user data after successful login

            // Create response with user details
           List<String> id=new ArrayList<>();
//            responseData.put("userId", user.getId());
            id.add(user.getId().toString());
            id.add(user.getGmail());


            return ResponseHandle.registrationResponse(HttpStatus.OK, "success", id);
        } catch (ProductException p) {
            return ResponseHandle.registrationResponse(HttpStatus.BAD_REQUEST, "failed", p.getError());
        }
    }

    //fetch current user
    @GetMapping("/currentLogin/{password}")
    public UserData fetchCurrentUser(@PathVariable("password") String password){
       return userService.currentUser(password);
    }
}
