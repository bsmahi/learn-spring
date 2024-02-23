package com.bsmlabs.learnspring.springawareinterface.applicationeventpublisheraware;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

/**
 * We create a bean <code>EventPublisher</code> that implements <code>ApplicationEventPublisherAware</code>.
 * This bean is responsible for publishing custom events.
 * It implements <code>setApplicationEventPublisher</code> to receive the event publisher, and it has a method publishCustomEvent to publish custom events.
 */

// Bean that publishes custom events
@Component
public class MyEventPublisher implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    // Method to publish custom event
    public void publishCustomEvent(String message) {
        applicationEventPublisher.publishEvent(new MyCustomEvent(this, message));
    }
}
