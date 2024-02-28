package com.bsmlabs.learnspring.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect // Indicates that this is an Aspect
@Configuration // Indicates that this file contains Spring Bean Configuration for an Aspect
public class UserAccessAspect {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    // execution(* PACKAGE.*.*(..))
    // Weaving & Weaver
    // @Before - we would want to execute the Aspect before execution of the method
    // execution(* com.bsmlabs.learnspring.aop.repository.*.*(..)) - defines point-cut where we would want to intercept all methods calls
    // made to any methods in the package
    @Before("execution(* com.bsmlabs.learnspring.aop.repository.*.*(..))") // the point-cut expression
    public void before(JoinPoint joinPoint) { // the point cut signature
        // Advice
        logger.info(" Check for user access");
        logger.info(" Allowed execution for {}", joinPoint);
    }

    @AfterReturning(value = "execution(* com.bsmlabs.learnspring.aop.repository.*.*(..))", returning = "result")
    // the point-cut expression
    public void afterReturning(JoinPoint joinPoint, Object result) {
        // Advice
        logger.info("{} returned with values {}", joinPoint, result);
    }

    @After("execution(* com.bsmlabs.learnspring.aop.repository.*.*(..))")
    // the point-cut expression
    public void after(JoinPoint joinPoint) {
        // Advice
        logger.info(" after execution of {}", joinPoint);
    }

    @Around("@annotation(com.bsmlabs.learnspring.aop.model.TrackTime)")
    // the point-cut expression
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        long startTime = System.currentTimeMillis();
        proceedingJoinPoint.proceed();

        long totalTimeTaken = System.currentTimeMillis() - startTime;

        logger.info("Time Taken by {} is {}s", proceedingJoinPoint, totalTimeTaken);
    }


}
