package com.cheng.learningdemo.DesignPattern.StrategyPattern.demo1;

/**
 * 满减类
 */
public class CashReturn extends CashSuper {

    //满多少
    private double moneyCondition;
    //减多少
    private double moneyReturn;

    //构造方法
    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double getResult(double money) {
        double result;
        if(money >= moneyCondition) {
            result = money - moneyReturn;
        }else {
            result = money;
        }
        return result;
    }
}
