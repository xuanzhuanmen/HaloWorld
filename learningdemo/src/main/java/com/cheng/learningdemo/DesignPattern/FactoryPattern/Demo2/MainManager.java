package com.cheng.learningdemo.DesignPattern.FactoryPattern.Demo2;

public class MainManager extends EmployeeManager {
    @Override
    public Integer getPulishRating() {
        //经理15%
        return 15;
    }
}
