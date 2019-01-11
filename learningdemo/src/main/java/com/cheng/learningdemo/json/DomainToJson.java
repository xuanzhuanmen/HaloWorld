package com.cheng.learningdemo.json;

import com.alibaba.fastjson.JSON;
import com.cheng.learningdemo.test.aboutNullPointer.Employee;

public class DomainToJson {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("cheng");
        String employeeJson = JSON.toJSONString(employee);
        System.out.println(employeeJson);
    }
}
