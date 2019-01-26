package com.cheng.learningdemo.DesignPattern.StrategyPattern.demo1;

public class CashContext {
    private CashSuper cashSuper = null;

    public CashContext(String type) {
        switch (type) {
            case "normal":
                cashSuper = new CashNormal();
                break;
            case "rebate":
                cashSuper = new CashRebate(0.8);
                break;
            case "return":
                cashSuper = new CashReturn(300, 100);
                break;
        }
    }

    public double getResult(double money) {
        double result;
        result = cashSuper.getResult(money);
        return result;
    }


}
