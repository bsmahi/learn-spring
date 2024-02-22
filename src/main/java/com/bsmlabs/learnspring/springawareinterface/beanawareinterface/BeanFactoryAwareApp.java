package com.bsmlabs.learnspring.springawareinterface.beanawareinterface;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanFactoryAwareApp {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve BeanFactoryAwareBean from the context
        var beanFactoryAwareBean = context.getBean(BeanFactoryAwareBean.class);

        System.out.println("Get the Bean Details "+ beanFactoryAwareBean.showMessage());
    }
}
