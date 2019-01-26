package com.cheng.learningdemo.DesignPattern.StrategyPattern.demo1;

/**
 * 封装变化点是面向对象中一个很重要的思维方式。
 * 策略模型，结合简单工厂模型，这里，我直接用CashContext类，将所有的东西封装好，直接调用。
 * 封装的底层，使用了多态，回去调用对应的子类的方法。
 * 跟简单工厂模式相比较，好处在于，创建对象的时候，简单工厂需要知道CashSuper类和Factory类。
 * 而策略模式，我们只需要知道CashContext这一个类即可。耦合度更低了。
 * 用CashContext创建对象，然后调用CashContext的相应方法。这类封装是更彻底的。
 * 总结：
 * 策略模式封装了变化。
 * 当我们在实际业务分析时候，发现很多种业务场景判断，需要在不同时间应用不同的业务规则。那么就可以考虑策略模式了。
 */
public class StrategyDemo {
    public static void main(String[] args) {
        CashContext cashContext = new CashContext("rebate");
        double needPay = cashContext.getResult(1000);
        System.out.println("应付：" + needPay);
    }
}
