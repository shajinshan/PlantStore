package com.ryncoorchids.ryncoOrchids.service;

import com.ryncoorchids.ryncoOrchids.entity.PlantCart;
import com.ryncoorchids.ryncoOrchids.entity.PlantsDetails;
import com.ryncoorchids.ryncoOrchids.model.PlantCartModel;
import com.ryncoorchids.ryncoOrchids.model.ProductModel;
import com.ryncoorchids.ryncoOrchids.repository.CartRepositoty;
import com.ryncoorchids.ryncoOrchids.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ProductsService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    CartRepositoty cartRepositoty;

    public void addProduct(ProductModel productModel) {

        PlantsDetails insertDetail=new PlantsDetails();

        insertDetail.setProductName(productModel.getProductName());
        insertDetail.setCategory(productModel.getCategory());
        insertDetail.setDescription(productModel.getDescription());
        insertDetail.setPrice(productModel.getPrice());
        insertDetail.setImg(productModel.getImg());
        insertDetail.setDate(productModel.getDate());

        productRepository.save(insertDetail);
    }

    public List<PlantsDetails> readAll() {
        return productRepository.findAll();
    }

    public PlantsDetails findByID(Long id) {
        return  productRepository.findById(id).get();
    }

    public List<PlantsDetails> searchProducts(String keyword) {

        return productRepository.searchProducts(keyword);
    }





    public void deleteCart(Long id) {
        cartRepositoty.deleteById(id);
    }

    public void deleteProduct(Long id) {

        productRepository.deleteById(id);
    }

    public List<PlantsDetails> getLatestProducts() {

            Pageable limit = PageRequest.of(0, 4);  // Limit to 4 results
            return productRepository.findAllByOrderByDateDesc(limit);

    }


}
