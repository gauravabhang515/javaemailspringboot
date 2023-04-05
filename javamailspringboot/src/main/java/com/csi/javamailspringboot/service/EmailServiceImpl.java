package com.csi.javamailspringboot.service;

import com.csi.javamailspringboot.dao.EmailDaoImpl;
import com.csi.javamailspringboot.model.EmailModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;

@Service
public class EmailServiceImpl {

    @Autowired
    EmailDaoImpl emailDaoImpl;


    public void sendMail(EmailModel emailModel) throws MessagingException {
        emailDaoImpl.sendEmail(emailModel);
    }
}
