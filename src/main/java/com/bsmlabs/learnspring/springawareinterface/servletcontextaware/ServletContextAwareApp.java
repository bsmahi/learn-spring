package com.bsmlabs.learnspring.springawareinterface.servletcontextaware;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServletContextAwareApp {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve the bean from the Spring context
        MyServletContextAwareBean servletContextAwareBean = context.getBean(MyServletContextAwareBean.class);

        // Use the bean to access ServletContext information
        servletContextAwareBean.printContextInfo();
    }
}
