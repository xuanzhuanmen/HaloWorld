package com.cheng.learningdemo.DesignPattern.FactoryPattern.Demo3;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        Shape shape1 = ShapeFactory.createShape("Circle");
        shape1.draw();

        Shape shape2 = ShapeFactory.createShape("square");
        shape2.draw();

        Shape shape3 = ShapeFactory.createShape("Rectangle");
        shape3.draw();
    }
}
