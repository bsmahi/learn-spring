package com.bsmlabs.learnspring.springawareinterface.applicationcontextware;

import com.bsmlabs.learnspring.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextAwareApp {

    public static void main(String[] args) throws InterruptedException {
        var annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        ApplicationContextAwareBean myBean = annotationConfigApplicationContext.getBean(ApplicationContextAwareBean.class);
        myBean.displayMessage();
        Thread.sleep(1000);

        myBean = annotationConfigApplicationContext.getBean(ApplicationContextAwareBean.class);
        myBean.displayMessage();
    }
}
