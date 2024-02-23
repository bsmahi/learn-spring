package com.bsmlabs.learnspring.springawareinterface.applicationeventpublisheraware;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * In the main Spring Boot application class, we inject MyEventPublisher and
 * publish a custom event during application startup.
 */
@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    private final MyEventPublisher eventPublisher;
    private final OrderEventPublisher orderEventPublisher;

    // constructor dependency injection
    public MainApplication(MyEventPublisher eventPublisher,
                           OrderEventPublisher orderEventPublisher) {
        this.eventPublisher = eventPublisher;
        this.orderEventPublisher = orderEventPublisher;
    }

    @Bean
    public CommandLineRunner startUp() {
        return args -> {
            eventPublisher.publishCustomEvent("Generate Custom Event");

            // Simulate order placement
            Long orderId = 141327L;
            orderEventPublisher.publishOrderPlacedEvent(orderId);
        };
    }

}
