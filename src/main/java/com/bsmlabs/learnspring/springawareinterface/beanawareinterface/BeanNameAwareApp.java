package com.bsmlabs.learnspring.springawareinterface.beanawareinterface;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanNameAwareApp {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("applicationContext.xml");

        var beanNameAwareBean = context.getBean(BeanNameAwareBean.class);
        System.out.println("My bean name is: " + beanNameAwareBean.displayBeanName());
    }
}
