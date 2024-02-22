package com.bsmlabs.learnspring.springawareinterface.applicationcontextware;

import com.bsmlabs.learnspring.models.Book;
import com.bsmlabs.learnspring.models.Car;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        // Load the Spring XML configuration file
        // Initialize Spring context
        var context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        // Retrieve the Car bean from the BeanFactory
        Car car = context.getBean("car", Car.class);
        Car carOne = context.getBean("car", Car.class);

        // Display information about the car
        System.out.println(car);
        System.out.println(carOne);

        Book book = context.getBean("book", Book.class);
        System.out.println(book);

//        // Initialize Spring context
//        var annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
//
//        // Retrieve the Car bean from the Spring context
//        Car carTwo = annotationConfigApplicationContext.getBean(Car.class);
//
//        // Display information about the car
//        System.out.println(carTwo);

        // Close the context
        context.close();
    }
}
