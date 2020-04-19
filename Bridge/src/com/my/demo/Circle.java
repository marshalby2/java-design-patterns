package com.my.demo;

/**
 * @Description TODO
 * @Author marshal
 * @Date 18/4/20 9:42 PM
 */
public class Circle extends Shape{

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void show() {
        System.out.println("This is " + color.getColor() + " Circle.");
    }
}
