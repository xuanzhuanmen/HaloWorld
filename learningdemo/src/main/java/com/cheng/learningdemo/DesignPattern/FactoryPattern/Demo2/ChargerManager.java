package com.cheng.learningdemo.DesignPattern.FactoryPattern.Demo2;

public class ChargerManager extends EmployeeManager {
    @Override
    public Integer getPulishRating() {
        //主管25%
        return 25;
    }
}
