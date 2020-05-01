package com.my.demo;

/**
 * 加法
 */
public class Addition implements Mathematical {
    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}
