package com.bsmlabs.learnspring;

import com.bsmlabs.learnspring.models.Book;
import com.bsmlabs.learnspring.models.Car;
import com.bsmlabs.learnspring.models.MyBean;
import com.bsmlabs.learnspring.springawareinterface.applicationcontextware.ApplicationContextAwareBean;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

// We annotate the class with @Configuration to indicate that this class contains Spring Bean definitions.
@Configuration
public class AppConfig {

    @Bean
    public Car car() {
        return new Car("Ford", "Figo");
    }

    @Bean
    public Book book() {
        return new Book("S", "A");
    }


    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public MyBean myBean() {
       return new MyBean();
    }

    @Bean
    public ApplicationContextAwareBean applicationContextAwareBean() {
        return new ApplicationContextAwareBean();
    }
}
