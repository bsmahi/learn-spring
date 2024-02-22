package com.bsmlabs.learnspring.springawareinterface.beanawareinterface;

import com.bsmlabs.learnspring.models.MyBean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

/**
 * Here, BeanFactoryAwareBean implements the BeanFactoryAware interface and overrides the setBeanFactory method to receive the reference to the BeanFactory during initialization.
 */

public class BeanFactoryAwareBean implements BeanFactoryAware {

    private BeanFactory beanFactory;

    // setter dependency injection
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    public String showMessage() {
        MyBean myBean = beanFactory.getBean(MyBean.class);
        return myBean.getDateTime();
    }
}
