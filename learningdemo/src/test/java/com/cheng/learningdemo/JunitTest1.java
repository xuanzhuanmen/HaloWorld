package com.cheng.learningdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * junit demo
 */
public class JunitTest1 {

    public int add(int x, int y) {
        return x + y;
    }

    @Before
    public void beaforeRun() {
        System.out.println("-----run before do something-----");
    }

    @Test
    public void testAdd() {
        int result = add(1,2);
        System.out.println("result = " + result);
    }

    @After
    public void afterRun() {
        System.out.println("-----run after do something-----");
    }
}
