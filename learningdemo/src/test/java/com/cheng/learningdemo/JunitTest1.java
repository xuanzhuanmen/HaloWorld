package com.cheng.learningdemo;

import org.junit.Test;

/**
 * junit demo
 */
public class JunitTest1 {

    public int add(int x, int y) {
        return x + y;
    }

    @Test
    public void testAdd() {
        int result = add(1,2);
        System.out.println("result = " + result);
    }
}
