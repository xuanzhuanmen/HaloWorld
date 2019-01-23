package com.cheng.learningdemo.domain;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

public class Person implements Serializable {
    /*@JSONField(name = "realName")*/
    private String name;
    private int age;
    private String mobile;

    public Person() {

    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }


    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
