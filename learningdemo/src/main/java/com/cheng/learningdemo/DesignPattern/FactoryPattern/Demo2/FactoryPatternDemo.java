package com.cheng.learningdemo.DesignPattern.FactoryPattern.Demo2;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        IManager iManager1 = IManagerFactory.createIManager("组长");
        Integer publishRating1 = iManager1.getPulishRating();
        System.out.println(publishRating1);
    }
}
