package com.ryncoorchids.ryncoOrchids.service;

import com.ryncoorchids.ryncoOrchids.entity.OrderDetails;
import com.ryncoorchids.ryncoOrchids.model.OrderDetailModel;
import com.ryncoorchids.ryncoOrchids.repository.OrderDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDetailService {

    @Autowired
    OrderDetailRepository orderDetailRepository;

    public void addOrderDetail(OrderDetailModel orderDetailModel){

        OrderDetails orderDetails=new OrderDetails();

        orderDetails.setName(orderDetailModel.getName());
        orderDetails.setPincode(orderDetailModel.getPincode());
        orderDetails.setPhone(orderDetailModel.getPhone());
        orderDetails.setMail(orderDetailModel.getMail());
        orderDetails.setAddress(orderDetailModel.getAddress());
        orderDetails.setDistrict(orderDetailModel.getDistrict());
        orderDetails.setState(orderDetailModel.getState());
        orderDetails.setLandmark(orderDetailModel.getLandmark());
        orderDetails.setAlterPhoneNumber(orderDetailModel.getAlterPhoneNumber());
        orderDetails.setPlantid(orderDetailModel.getPlantid());
        orderDetails.setPlantName(orderDetailModel.getPlantName());
        orderDetails.setPrice(orderDetailModel.getPrice());
        orderDetails.setCategory(orderDetailModel.getCategory());
        orderDetails.setImg(orderDetailModel.getImg());

        orderDetailRepository.save(orderDetails);
    }

    public OrderDetails viewById(Long plantid) {
        return orderDetailRepository.customFindById(plantid);
    }

    public List<OrderDetails> readAllorderData() {
        return orderDetailRepository.findAll();
    }

    public void deleteOrderDetail(Long id) {
        orderDetailRepository.deleteById(id);
    }
}
