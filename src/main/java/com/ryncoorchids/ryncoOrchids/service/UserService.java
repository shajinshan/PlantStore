package com.ryncoorchids.ryncoOrchids.service;


import com.ryncoorchids.ryncoOrchids.entity.UserData;
import com.ryncoorchids.ryncoOrchids.exception.ProductException;
import com.ryncoorchids.ryncoOrchids.model.UserDataLoginModel;
import com.ryncoorchids.ryncoOrchids.model.UserDataModel;
import com.ryncoorchids.ryncoOrchids.repository.UserDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {

    @Autowired
    UserDataRepository userDataRepository;

    public void addNewUser(UserDataModel userDataModel) {

        UserData userData=new UserData();

        userData.setGmail(userDataModel.getGmail());
        userData.setPhone(userDataModel.getPhone());
        userData.setPassword(userDataModel.getPassword());
        userDataRepository.save(userData);

    }

    public UserData loginUser (UserDataLoginModel userDataLoginModel) throws ProductException {

        ArrayList<String> error=new ArrayList<>();
       UserData userData= userDataRepository.checkValidLogin(userDataLoginModel.getGmail(),userDataLoginModel.getPassword());

       error.add("invalid mail or password");

       if(userData == null ){
           throw new ProductException(error,"invalid mail or password");
       }
        return userData;
    }

    public UserData currentUser(String password) {
       return userDataRepository.findByPasswordCustom(password);

    }
}
