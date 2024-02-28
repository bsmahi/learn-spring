package com.bsmlabs.learnspring.aop.repository;

import com.bsmlabs.learnspring.aop.model.TrackTime;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class DataAccessObject1 {

    @TrackTime
    public String getSomeThing() {
        return "DataAccessObject-1 " + UUID.randomUUID();
    }
}
