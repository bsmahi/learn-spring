1. We define a custom event class MyCustomEvent that extends ApplicationEvent. This event carries a message.

2. We create a bean MyEventPublisher that implements ApplicationEventPublisherAware.
This bean is responsible for publishing custom events. It implements setApplicationEventPublisher to receive the event publisher, and it has a method publishCustomEvent to publish custom events.

3. We define a listener bean MyEventListener to handle custom events. It has a method handleCustomEvent annotated with @EventListener to listen for custom events.

4. In the main Spring Boot application class, we inject MyEventPublisher and publish a custom event during application startup.