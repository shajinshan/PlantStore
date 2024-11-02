package com.ryncoorchids.ryncoOrchids.service;

import com.ryncoorchids.ryncoOrchids.entity.AdminData;
import com.ryncoorchids.ryncoOrchids.exception.ProductException;
import com.ryncoorchids.ryncoOrchids.model.AdminDataModel;
import com.ryncoorchids.ryncoOrchids.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminService {

    @Autowired
    AdminRepository adminRepository;

    public void addAdminSign(AdminDataModel adminDataModel) {

        List<String>error = new ArrayList<>();

        AdminData adminData= new AdminData();


            if(adminDataModel.getAdminName().isEmpty()){
                error.add("Enter a username");
            }
            if(adminDataModel.getPassword().isEmpty()){
                error.add("enter Password");
            }

            if(!error.isEmpty()){
                throw new ProductException(error,"Failed sign in");
        }

            adminData.setAdminName(adminDataModel.getAdminName());
            adminData.setPassword(adminDataModel.getPassword());
            adminRepository.save(adminData);

            }

    public void login(AdminDataModel adminDataModel) throws ProductException {

        List<String>error = new ArrayList<>();
        AdminData adminData = adminRepository.findUserByReg(adminDataModel.getAdminName(), adminDataModel.getPassword());

        error.add("Invalid username or password");

        if (adminData == null) {
            throw new ProductException(error,"Invalid username or password");
        }



    }


}
