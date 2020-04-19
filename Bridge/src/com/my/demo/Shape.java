package com.my.demo;

/**
 * @Description TODO
 * @Author marshal
 * @Date 18/4/20 9:39 PM
 */
public abstract class Shape {

    protected Color color;

    protected Shape(Color color) {
        this.color = color;
    }

    public abstract void show();

}
