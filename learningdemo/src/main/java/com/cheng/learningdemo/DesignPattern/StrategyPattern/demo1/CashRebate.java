package com.cheng.learningdemo.DesignPattern.StrategyPattern.demo1;

/**
 * 折扣类
 */
public class CashRebate extends CashSuper {

    private double rebate;

    /**
     * 通过构造方法来传递折扣参数
     * @param rebate
     */
    public CashRebate(double rebate) {
        this.rebate = rebate;
    }

    @Override
    public double getResult(double money) {
        double result = money * rebate;
        return result;
    }
}
