package com.cheng.learningdemo.test.aboutNullPointer;

public class Employee {
    private int id;
    private String name;
    private Duty duty;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", duty=" + duty +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public Duty getDuty() {
        return duty;
    }

    public void setDuty(Duty duty) {
        this.duty = duty;
    }
}
