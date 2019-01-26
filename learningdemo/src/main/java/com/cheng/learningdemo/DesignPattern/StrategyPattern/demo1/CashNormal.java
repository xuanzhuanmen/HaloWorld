package com.cheng.learningdemo.DesignPattern.StrategyPattern.demo1;

/**
 * 常规类
 */
public class CashNormal extends CashSuper {

    @Override
    public double getResult(double money) {
        return money;
    }
}
