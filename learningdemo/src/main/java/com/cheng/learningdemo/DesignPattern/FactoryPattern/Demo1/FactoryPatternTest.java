package com.cheng.learningdemo.DesignPattern.FactoryPattern.Demo1;

public class FactoryPatternTest {
    public static void main(String[] args) {
        Operation operation = OperationFactory.createOperation("+");
        double num1 = 19;
        double num2 = 21;
        double result = operation.getResult(num1, num2);
        System.out.println(result);
    }
}
