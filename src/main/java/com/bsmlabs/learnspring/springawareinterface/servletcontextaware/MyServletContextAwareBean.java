package com.bsmlabs.learnspring.springawareinterface.servletcontextaware;

import jakarta.servlet.ServletContext;
import org.springframework.web.context.ServletContextAware;

public class MyServletContextAwareBean implements ServletContextAware {

    private ServletContext servletContext;

    @Override
    public void setServletContext(ServletContext servletContext) {
        this.servletContext = servletContext;
    }

    public void printContextInfo() {
        if (servletContext != null) {
            String contextPath = servletContext.getContextPath();
            System.out.println("ServletContextAware Bean - Context Path: " + contextPath);
        } else {
            System.out.println("ServletContext is not set.");
        }
    }
}
