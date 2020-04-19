package com.my.demo;

/**
 * @Description TODO
 * @Author marshal
 * @Date 18/4/20 9:42 PM
 */
public class Triangle extends Shape{

    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void show() {
        System.out.println("This is " + color.getColor() + " Triangle.");
    }
}
