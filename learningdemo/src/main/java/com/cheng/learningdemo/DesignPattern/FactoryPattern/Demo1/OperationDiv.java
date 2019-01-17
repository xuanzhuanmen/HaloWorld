package com.cheng.learningdemo.DesignPattern.FactoryPattern.Demo1;

/**
 * 除法子类
 */
public class OperationDiv extends Operation {
    @Override
    public double getResult(double number1, double number2) {
        double result = 0;
        if(number2 != 0) {
            result = number1 / number2;
        }else {
            try {
                throw new Exception("除数不能为0！");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}
