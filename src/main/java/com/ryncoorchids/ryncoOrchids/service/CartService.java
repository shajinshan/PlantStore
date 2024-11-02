package com.ryncoorchids.ryncoOrchids.service;

import com.ryncoorchids.ryncoOrchids.entity.PlantCart;
import com.ryncoorchids.ryncoOrchids.entity.UserData;
import com.ryncoorchids.ryncoOrchids.exception.ProductException;
import com.ryncoorchids.ryncoOrchids.model.PlantCartModel;
import com.ryncoorchids.ryncoOrchids.repository.CartRepositoty;
import com.ryncoorchids.ryncoOrchids.repository.UserDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class CartService {

    @Autowired
    CartRepositoty cartRepositoty;

    @Autowired
    UserDataRepository userDataRepository;

    public void addCartPlat(Long userId, PlantCartModel plantCartModel) throws ProductException {
        List<String>error=new ArrayList<>();
        error.add("user not found");

        UserData user=userDataRepository.findById(userId).orElseThrow(()-> new ProductException(error,"user not found"));


        PlantCart cart=new PlantCart();

        cart.setProductName(plantCartModel.getProductName());
        cart.setCategory(plantCartModel.getCategory());
        cart.setImg(plantCartModel.getImg());
        cart.setPrice(plantCartModel.getPrice());
        cart.setDescription(plantCartModel.getDescription());
        //changes
        cart.setUser(user);
        cart.setProductId(plantCartModel.getProductId());
        //
        cart.setDate(LocalDate.now());

        cartRepositoty.save(cart);
    }

    public List<PlantCart> allCartById(Long userId)throws  ProductException {
        List<String>error=new ArrayList<>();
        error.add("user not found");
        UserData user = userDataRepository.findById(userId)
                .orElseThrow(() -> new ProductException(error,"User not found"));

        return cartRepositoty.findByUser(user);
    }

    public void deleteCart(Long id) {
        cartRepositoty.deleteById(id);
    }

    public PlantCart viewCartitem(Long id) {
        return cartRepositoty.findById(id).get();
    }
}
