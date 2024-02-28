package com.bsmlabs.learnspring.aop.service;

import com.bsmlabs.learnspring.aop.model.TrackTime;
import com.bsmlabs.learnspring.aop.repository.DataAccessObject2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class BusinessServiceTwo {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final DataAccessObject2 dataAccessObject2;

    // Constructor Dependency Injection
    public BusinessServiceTwo(DataAccessObject2 dataAccessObject2) {
        this.dataAccessObject2 = dataAccessObject2;
    }

    public String compute() {
        String val = dataAccessObject2.getSomeThing();
        logger.info("In Business - {}", val);
        return val;
    }
}
