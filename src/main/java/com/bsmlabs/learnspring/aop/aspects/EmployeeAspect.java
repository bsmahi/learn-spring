package com.bsmlabs.learnspring.aop.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeAspect {

    @Before("execution(public String getName())")// point cut expression
    public void getNameAdvice() { // point cut signature
        // Advice
        System.out.println("Executing Advice on getName()");
    }

    @After("execution(* set*(..))")
    public void setNameAdvice() {
        System.out.println("Executing Advice on setName()");
    }
}
