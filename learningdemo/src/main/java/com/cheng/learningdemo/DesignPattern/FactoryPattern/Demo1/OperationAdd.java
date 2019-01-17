package com.cheng.learningdemo.DesignPattern.FactoryPattern.Demo1;

public class OperationAdd extends Operation {
    @Override
    public double getResult(double number1, double number2) {
        double result = number1 + number2;
        return number1 + number2;
    }
}
