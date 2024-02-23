package com.bsmlabs.learnspring.springawareinterface.applicationeventpublisheraware;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

// Listener for order placement events
@Component
class OrderEventListener {
    // Method to handle order placement event
    @EventListener
    public void handleOrderPlacedEvent(OrderPlacedEvent event) {
        Long orderId = event.getOrderId();
        // Send email notification to the user
        System.out.println("Sent email notification for order #" + orderId);
    }
}