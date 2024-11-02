package com.ryncoorchids.ryncoOrchids.controller;

import com.ryncoorchids.ryncoOrchids.exception.ProductException;
import com.ryncoorchids.ryncoOrchids.model.AdminDataModel;
import com.ryncoorchids.ryncoOrchids.service.AdminService;
import com.ryncoorchids.ryncoOrchids.util.ResponseHandle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
@CrossOrigin
public class AdminController {

    @Autowired
    AdminService adminService;


    @PostMapping("/addnew")
    public ResponseEntity<?> addAdmin(@RequestBody AdminDataModel adminDataModel){
        try{
            adminService.addAdminSign(adminDataModel);
            return ResponseHandle.registrationResponse(HttpStatus.OK,"success",null);
        }catch (ProductException e){
           return ResponseHandle.registrationResponse(HttpStatus.BAD_REQUEST,"Error",e.getError());
        }

    }
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody AdminDataModel adminDataModel) {
        try {
            adminService.login(adminDataModel);

            return ResponseHandle.registrationResponse(HttpStatus.OK, "Login success", null);

        } catch (ProductException r) {
            return ResponseHandle.registrationResponse(HttpStatus.BAD_REQUEST, "Failed", r.getError());
        }


    }

}
