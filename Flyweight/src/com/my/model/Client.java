package com.my.model;

/**
 * @Description TODO
 * @Author marshal
 * @Date 19/4/20 9:38 PM
 */
public class Client {
    public static void main(String[] args) {
        var a = FlyweightFactory.getFlyweight("A");
        a.operation();

        var a1 = FlyweightFactory.getFlyweight("A");
        a1.operation();
    }
}
