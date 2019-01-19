package com.cheng.learningdemo.DesignPattern.FactoryPattern.Demo3;

public class ShapeFactory {
    public static Shape createShape(String shapeType) {
        Shape shape = null;
        if(null == shapeType) {
            return shape;
        }
        if("circle".equalsIgnoreCase(shapeType)) {
            shape = new Circle();
        }
        if("square".equalsIgnoreCase(shapeType)) {
            shape = new Square();
        }
        if("rectangle".equalsIgnoreCase(shapeType)) {
            shape = new Rectangle();
        }
        return shape;
    }

    /**
     * 采用枚举的方式
     */
    public static Shape getShape(ShapeType shapeType) {
        switch(shapeType) {
            case CIRCLE:
                return new Circle();
            case SQUARE:
                return new Square();
            case RECTANGLE:
                return new Rectangle();
        }
        return null;
    }

}
