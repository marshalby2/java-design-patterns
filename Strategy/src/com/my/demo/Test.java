package com.my.demo;

/**
 * @Description TODO
 * @Author marshal
 * @Date 28/4/20 5:58 PM
 */
public class Test {
    public static void main(String[] args) {

        var subtract = new Calculator(new Subtract());
        System.out.println(subtract.calculate(20, 10));

        var addition = new Calculator(new Addition());
        System.out.println(addition.calculate(20, 10));

        var multiply = new Calculator(new Multiply());
        System.out.println(multiply.calculate(20, 10));
    }
}
