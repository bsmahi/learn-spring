package com.bsmlabs.learnspring.aop;

import com.bsmlabs.learnspring.aop.service.BusinessServiceOne;
import com.bsmlabs.learnspring.aop.service.BusinessServiceTwo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class BusinessServiceAOPTest {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private BusinessServiceOne businessServiceOne;

    @Autowired
    private BusinessServiceTwo businessServiceTwo;

    @Test
    void shouldVerifyAOP() {
        logger.info(businessServiceOne.compute());
        logger.info(businessServiceTwo.compute());
    }
}
