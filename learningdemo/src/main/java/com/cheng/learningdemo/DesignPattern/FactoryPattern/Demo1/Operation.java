package com.cheng.learningdemo.DesignPattern.FactoryPattern.Demo1;


/**
 * 面向对象之抽象
 * 将操作抽象成一个对象
 * 将共性整合在父类中，让子类去继承父类，重新父类的方法，以达到差异化的实现。
 * 使用工厂类来创建对象，体现了多态性。
 * 这种设计模式，将面向对象的封装、继承、多态体现得淋漓尽致。
 * 目的是：降低耦合度，容易维护，可拓展性和复用性。
 * 举例子：如果想要加开根的实现，只需要创建一个开根操作子类，并在工厂类中补充开根创建逻辑即可。
 */
public class Operation {
    private double number1;
    private double number2;

    public double getResult(double number1, double number2) {
        double result = 0;
        return result;
    }

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }
}
