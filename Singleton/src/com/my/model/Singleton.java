package com.my.model;

/**
 * @Description TODO
 * @Author marshal
 * @Date 15/4/20 4:32 PM
 */
public class Singleton {

    private Singleton() {}

    private static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }
}
