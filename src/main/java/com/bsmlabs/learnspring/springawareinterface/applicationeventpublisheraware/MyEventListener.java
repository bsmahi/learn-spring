package com.bsmlabs.learnspring.springawareinterface.applicationeventpublisheraware;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * We define a listener bean <code>MyEventListener</code> to handle custom events.
 * It has a method handleCustomEvent annotated with <code>@EventListener</code>  to listen for custom events.
 */
// Listener for custom events
@Component
public class MyEventListener {

    // Method to handle custom event
    @EventListener
    public void handleCustomEvent(MyCustomEvent event) {
        System.out.println("Received custom event: " + event.getMessage());
    }
}
