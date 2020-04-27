package com.smart.event;

import org.springframework.context.ApplicationListener;

public class MailSenderListener implements ApplicationListener<MailSendEvent> {

    public void onApplicationEvent(MailSendEvent mailSendEvent) {
        MailSendEvent mse = mailSendEvent;
        System.out.println("MailSenderListener--> Send a mail to " + mse.getTo());
    }
}
