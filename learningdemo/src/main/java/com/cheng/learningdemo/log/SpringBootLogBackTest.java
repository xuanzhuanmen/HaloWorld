package com.cheng.learningdemo.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SpringBootLogBackTest {
    private final static Logger logger = LoggerFactory.getLogger(SpringBootLogBackTest.class);

    public static void main(String[] args) {
        logger.info("logback success!");
        String a = "haha";
        logger.info("test how to reset in git {}", a);
    }
}
