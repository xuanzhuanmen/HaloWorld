package com.cheng.learningdemo.DesignPattern.FactoryPattern.Demo2;

public class Operator extends EmployeeManager {
    @Override
    public Integer getPulishRating() {
        //没有比例
        return 100;
    }
}
