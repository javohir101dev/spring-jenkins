package com.example.springjenkinsapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringJenkinsAppApplication {

    public  static Logger logger = LoggerFactory.getLogger(SpringJenkinsAppApplication.class);

    @PostConstruct
    public void init(){
        logger.info("Application started . . .");
    }

    public static void main(String[] args) {
        logger.info("Application executed . . .");
        SpringApplication.run(SpringJenkinsAppApplication.class, args);
    }

}
