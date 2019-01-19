package com.cheng.learningdemo.DesignPattern.FactoryPattern.Demo3;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        //普通方式
        Shape shape1 = ShapeFactory.createShape("circle");
        shape1.draw();
        Shape shape2 = ShapeFactory.createShape("square");
        shape2.draw();
        Shape shape3 = ShapeFactory.createShape("Rectangle");
        shape3.draw();

        //采用枚举的方式
        Shape s1 = ShapeFactory.getShape(ShapeType.CIRCLE);
        s1.draw();
        Shape s2 = ShapeFactory.getShape(ShapeType.SQUARE);
        s2.draw();
        Shape s3 = ShapeFactory.getShape(ShapeType.RECTANGLE);
        s3.draw();

    }
}
