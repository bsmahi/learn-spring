# BeanFactory

In this XML configuration file:

We define a bean with the id "car" and specify its class as com.bsmlabs.learnspring.
We provide constructor arguments for the Car bean, specifying the brand and model.

Now, let's use the BeanFactory to load and retrieve the Car bean:


A BeanFactory is part of the core of the Spring Framework and serves as the central container for managing beans within a Spring application. It is responsible for instantiating, configuring, and managing the lifecycle of beans. Beans are Java objects that form the backbone of an application and are managed by the Spring container.

Here's an example to illustrate how to use BeanFactory in a Spring application:

Let's say we have a simple Java class representing a Car:

java
Copy code
```java
public class Car {
private String brand;
private String model;

    // Constructor
    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Getters and setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // toString method for representation
    @Override
    public String toString() {
        return "Car [brand=" + brand + ", model=" + model + "]";
    }
}
```
Now, let's configure a Spring XML configuration file (beans.xml) where we define our beans:

```xml

<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
    http://www.springframework.org/schema/beans/spring-beans.xsd">

    <!-- Bean definition for Car -->
    <bean id="car" class="com.example.Car">
        <constructor-arg value="Toyota" />
        <constructor-arg value="Camry" />
    </bean>
</beans>
```
In this XML configuration file:

We define a bean with the id "car" and specify its class as com.example.Car.
We provide constructor arguments for the Car bean, specifying the brand and model.
Now, let's use the BeanFactory to load and retrieve the Car bean:

java

In this example:

We create an instance of ClassPathXmlApplicationContext and pass the location of the XML configuration file (beans.xml) to its constructor.
We retrieve the Car bean from the Spring context using getBean() method.
Finally, we display information about the retrieved Car bean.