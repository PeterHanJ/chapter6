package com.smart.editor;

import com.smart.event.MailSender;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EventTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:smart-context.xml");
        MailSender ms = context.getBean("mailSender",MailSender.class);
        ms.sendMail("Peter");

    }
}
