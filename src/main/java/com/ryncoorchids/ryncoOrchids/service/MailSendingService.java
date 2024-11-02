package com.ryncoorchids.ryncoOrchids.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailSendingService {

    @Autowired
    JavaMailSender javaMailSender;

    @Value("${spring.mail.username}")
    String fromEmailid;

    public void sendMail(String receipt,String subject,String body){

        SimpleMailMessage simpleMailMessage=new SimpleMailMessage();

        simpleMailMessage.setFrom(fromEmailid);
        simpleMailMessage.setTo(receipt);
        simpleMailMessage.setSubject(subject);
        simpleMailMessage.setText(body);
        simpleMailMessage.setCc("shajinshajin02@gmail.com");

        javaMailSender.send(simpleMailMessage);

    }
}
