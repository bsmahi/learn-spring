package com.bsmlabs.learnspring.aop.service;

import com.bsmlabs.learnspring.aop.model.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
