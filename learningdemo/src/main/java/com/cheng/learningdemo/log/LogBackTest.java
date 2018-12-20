package com.cheng.learningdemo.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * logback尝试
 * from：https://www.cnblogs.com/halberts/p/logback.html
 */
public class LogBackTest {
    private Logger logger = LoggerFactory.getLogger(LogBackTest.class);

    public void logTest() {
        logger.info("halo logback!!!");
        String a = "haha";
        String b = "why";
        String c = "lehelehe";
        // 占位符的使用
        logger.debug("test the messageformat for {} to {} endTo {}", a,b,c);
        logger.info("test the messageformat for {} to {} endTo {}", 1,2,3);
        logger.error("test the messageformat for {} to {} endTo {}", 1,2,3);
        try{
            throw new IllegalStateException("try to throw an Exception");
        }catch(Exception e){
            logger.error(e.getMessage(), e);
        }
    }
    public static void main(String[] args) {
        LogBackTest logBackTest = new LogBackTest();
        logBackTest.logTest();
    }
}
