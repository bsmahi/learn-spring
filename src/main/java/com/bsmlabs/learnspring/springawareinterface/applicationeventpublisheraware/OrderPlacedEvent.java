package com.bsmlabs.learnspring.springawareinterface.applicationeventpublisheraware;

import org.springframework.context.ApplicationEvent;

// Custom event class for order placement
public class OrderPlacedEvent extends ApplicationEvent {
    private Long orderId;

    public OrderPlacedEvent(Object source, Long orderId) {
        super(source);
        this.orderId = orderId;
    }

    public Long getOrderId() {
        return orderId;
    }
}
