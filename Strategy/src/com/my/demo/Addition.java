package com.my.demo;

/**
 * @Description TODO
 * @Author marshal
 * @Date 28/4/20 5:55 PM
 */
public class Addition implements Mathematical {
    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}
