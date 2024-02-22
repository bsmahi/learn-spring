package com.bsmlabs.learnspring.springawareinterface.messagesourceaware;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageSourceApp {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("applicationContext.xml");

        var messageSourceBean = context.getBean(MessageSourceBean.class);

        messageSourceBean.printMessage();
    }
}
