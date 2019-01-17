package com.cheng.learningdemo.DesignPattern.FactoryPattern.Demo1;

/**
 * 乘法子类
 */
public class OperationMul extends Operation {
    @Override
    public double getResult(double number1, double number2) {
        double result = number1 * number1;
        return result;
    }
}
