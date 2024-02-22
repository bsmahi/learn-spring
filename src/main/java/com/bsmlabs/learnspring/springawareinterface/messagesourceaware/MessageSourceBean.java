package com.bsmlabs.learnspring.springawareinterface.messagesourceaware;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;

import java.util.Locale;

public class MessageSourceBean implements MessageSourceAware {

    // MessageSource interface is used for resolving messages, supporting internationalization
    private MessageSource messageSource;

    // setter dependency injection
    @Override
    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public void printMessage() {
        String message = messageSource.getMessage("welcome.message", null, Locale.getDefault());
        System.out.println(message);
    }
}
