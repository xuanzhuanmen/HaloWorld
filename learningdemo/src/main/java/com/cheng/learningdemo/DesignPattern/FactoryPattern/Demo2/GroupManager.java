package com.cheng.learningdemo.DesignPattern.FactoryPattern.Demo2;

public class GroupManager extends EmployeeManager {
    @Override
    public Integer getPulishRating() {
        //组长30%
        return 30;
    }
}
