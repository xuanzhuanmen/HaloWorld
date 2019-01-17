package com.cheng.learningdemo.DesignPattern.FactoryPattern.Demo1;

public class OperationFactory {
    public static Operation createOperation(String operationType) {
        Operation operation = null;
        switch(operationType) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
        }
        return operation;
    }
}
