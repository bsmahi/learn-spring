package com.bsmlabs.learnspring.springawareinterface.beanawareinterface;

import org.springframework.beans.factory.BeanNameAware;

public class BeanNameAwareBean implements BeanNameAware {

    private String beanName;

    @Override
    public void setBeanName(String beanName) {
       this.beanName = beanName;
    }

    public String displayBeanName() {
        return beanName;

    }
}
