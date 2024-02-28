package com.bsmlabs.learnspring.aop.repository;

import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class DataAccessObject2 {

    public String getSomeThing() {
        return "DataAccessObject-2 " + UUID.randomUUID();
    }
}
