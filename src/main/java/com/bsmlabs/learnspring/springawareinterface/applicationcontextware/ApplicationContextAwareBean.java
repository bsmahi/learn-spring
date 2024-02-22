package com.bsmlabs.learnspring.springawareinterface.applicationcontextware;

import com.bsmlabs.learnspring.models.MyBean;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationContextAwareBean implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    // setter dependency injection
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void displayMessage() {
        MyBean bean = applicationContext.getBean(MyBean.class);
        System.out.println("Hi, current time is " + bean.getDateTime());
    }
}
