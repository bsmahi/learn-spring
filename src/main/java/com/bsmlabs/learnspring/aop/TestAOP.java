package com.bsmlabs.learnspring.aop;

import com.bsmlabs.learnspring.aop.model.Employee;
import com.bsmlabs.learnspring.aop.service.EmployeeService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAOP {

    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("classpath:aop-ac.xml");

        EmployeeService employeeService = context.getBean("employeeService", EmployeeService.class);

        System.out.println(employeeService.getEmployee().getName());


        employeeService.getEmployee().setName("Mahi");

        System.out.println(employeeService.getEmployee().getName());

        context.close();
    }
}
