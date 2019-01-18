package com.cheng.learningdemo.DesignPattern.FactoryPattern.Demo2;

public class DirectorManager extends EmployeeManager {
    @Override
    public Integer getPulishRating() {
        //总监5%
        return 5;
    }
}
