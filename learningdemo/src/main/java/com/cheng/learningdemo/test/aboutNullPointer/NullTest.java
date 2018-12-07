package com.cheng.learningdemo.test.aboutNullPointer;

public class NullTest {
    public static void main(String[] args) {
        //情况1：对象获取对象为null，不会报错
        // Employee employee = new Employee();
        // employee.setId(1);
        // employee.setName("cheng");
        // Duty duty = new Duty();
        // duty.setId(2);
        // employee.setDuty(duty);
        // if(null == employee.getDuty()) {
        //     System.out.println(employee.getDuty().getId());
        // }else {
        //     System.out.println(employee.getDuty().getContent());
        // }

        //情况2：空指针情况
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("cheng");
        // System.out.println(employee.getDuty());//会报空指针
        if(null != employee.getDuty()) {
            System.out.println(employee.getDuty().getContent());
        }else {
            System.out.println("employe's duty is null！");
        }

    }
}
