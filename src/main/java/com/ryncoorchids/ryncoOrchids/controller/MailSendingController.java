package com.ryncoorchids.ryncoOrchids.controller;

import com.ryncoorchids.ryncoOrchids.exception.ProductException;
import com.ryncoorchids.ryncoOrchids.model.MaildataModel;
import com.ryncoorchids.ryncoOrchids.service.MailSendingService;
import com.ryncoorchids.ryncoOrchids.util.ResponseHandle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("ordermail")
@CrossOrigin
public class MailSendingController {

    @Autowired
    MailSendingService mailSendingService;

    @PostMapping("/sendmail")
    public ResponseEntity<?> sendmailmessage(
           @RequestBody MaildataModel maildataModel){

        String body=String.format("Order Id : %s;\nCustomer Name : %s ;\nAddress : %s ;\nPhone Number : %s ;\nState : %s ;\nPlant Name : %s ;\nPrice : %s ;\nThanks for Shopping",
               maildataModel.getOrderId(),
        maildataModel.getName(),
        maildataModel.getAddress(),
        maildataModel.getPhone(),
        maildataModel.getState(),
        maildataModel.getPlantname(),
        maildataModel.getPrice());


        String subject="Order Confirmation";
       try{
           mailSendingService.sendMail(maildataModel.getReceipt(),subject,body);
           return ResponseHandle.registrationResponse(HttpStatus.OK,"success",null);
       }catch (ProductException p){
           return ResponseHandle.registrationResponse(HttpStatus.BAD_REQUEST,"not sended",p.getError());
        }

    }
}
