package com.example.springjenkinsapp;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class SpringJenkinsAppApplicationTests {

    public static Logger logger = LoggerFactory.getLogger(SpringJenkinsAppApplicationTests.class);

    @Test
    void contextLoads() {
        logger.info("Test case is executing . . .");
        assertTrue(true);
    }
}
