package com.my.demo;

/**
 * @Description TODO
 * @Author marshal
 * @Date 28/4/20 5:57 PM
 */
public class Calculator {
    private Mathematical mathematical;

    public Calculator(Mathematical mathematical) {
        this.mathematical = mathematical;
    }

    public int calculate(int a, int b) {
        return mathematical.calculate(a, b);
    }
}
