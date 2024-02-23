package com.bsmlabs.learnspring.springawareinterface.applicationeventpublisheraware;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

// Bean that publishes order placement events
@Component
public class OrderEventPublisher implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher eventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    // Method to publish order placement event
    public void publishOrderPlacedEvent(Long orderId) {
        eventPublisher.publishEvent(new OrderPlacedEvent(this, orderId));
    }
}
