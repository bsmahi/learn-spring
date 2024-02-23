package com.bsmlabs.learnspring.springawareinterface.applicationeventpublisheraware;

import org.springframework.context.ApplicationEvent;

// We define a custom event class MyCustomEvent that extends ApplicationEvent. This event carries a message.
public class MyCustomEvent extends ApplicationEvent {

    private final String message;

    public MyCustomEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
