package com.bsmlabs.learnspring.aop.service;

import com.bsmlabs.learnspring.aop.model.TrackTime;
import com.bsmlabs.learnspring.aop.repository.DataAccessObject1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class BusinessServiceOne {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final DataAccessObject1 dataAccessObject1;

    // Constructor Dependency Injection
    public BusinessServiceOne(DataAccessObject1 dataAccessObject1) {
        this.dataAccessObject1 = dataAccessObject1;
    }

    public String compute() {
        String val = dataAccessObject1.getSomeThing();
        logger.info("In Business - {}", val);
        return val;
    }
}
