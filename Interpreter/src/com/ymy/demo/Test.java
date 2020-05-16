package com.ymy.demo;

/**
 * @Description TODO
 * @Author marshal
 * @Date 16/5/20 3:40 PM
 */
public class Test {
    public static void main(String[] args) {

        Variable two = new Variable();
        Variable five = new Variable();
        Variable ten = new Variable();

        Context context = new Context();
        context.put(two, 2);
        context.put(five, 5);
        context.put(ten, 10);

        System.out.println(new Plus(two, five).interpret(context));         // 7
        System.out.println(new Substract(ten, two).interpret(context));     // 8
        System.out.println(new Multiply(five, two).interpret(context));     // 10
        System.out.println(new Division(ten, five).interpret(context));     // 2



    }
}
