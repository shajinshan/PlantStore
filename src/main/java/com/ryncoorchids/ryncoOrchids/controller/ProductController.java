package com.ryncoorchids.ryncoOrchids.controller;


import com.ryncoorchids.ryncoOrchids.entity.PlantCart;
import com.ryncoorchids.ryncoOrchids.entity.PlantsDetails;
import com.ryncoorchids.ryncoOrchids.exception.ProductException;
import com.ryncoorchids.ryncoOrchids.model.PlantCartModel;
import com.ryncoorchids.ryncoOrchids.model.ProductModel;
import com.ryncoorchids.ryncoOrchids.service.ProductsService;
import com.ryncoorchids.ryncoOrchids.util.ResponseHandle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/start")
@CrossOrigin
public class ProductController {


    @Autowired
ProductsService productsService;


    //add products
    @PostMapping("/add")
    public ResponseEntity<?> addProducts(@RequestBody ProductModel productModel){
        try {

            productsService.addProduct(productModel);
            return ResponseHandle.registrationResponse(HttpStatus.OK,"success",null);
        }catch (ProductException p){
            return ResponseHandle.registrationResponse(HttpStatus.BAD_REQUEST,"failed",p.getError());
        }
    }


    //fetching all products
    @GetMapping("/readAll")
    public List<PlantsDetails> readAll(){
        return productsService.readAll();
    }

    //Fetch By id From Products
    @GetMapping("/product/{id}")
    public  PlantsDetails getById(@PathVariable Long id){
        return  productsService.findByID(id);
    }

    //Search product
    @GetMapping("/product/search")
    public ResponseEntity<List<PlantsDetails>> searchProduct(@RequestParam String keyword){

        List<PlantsDetails> plants=productsService.searchProducts(keyword);

        return new ResponseEntity<>(plants,HttpStatus.OK);
    }

    //delete product by admin
    @DeleteMapping("/admin/delete/{id}")
    public ResponseEntity<?>deleteitem(@PathVariable("id") Long id){
        try {
            productsService.deleteProduct(id);
            return ResponseHandle.registrationResponse(HttpStatus.OK, "Deleted", null);
        }catch (ProductException p){
            return ResponseHandle.registrationResponse(HttpStatus.BAD_REQUEST, "Failed", p.getError());
        }
    }

    //list by latest Product
    @GetMapping("/latest")
    public List<PlantsDetails> getLatestProducts() {
        return productsService.getLatestProducts();
    }


}
