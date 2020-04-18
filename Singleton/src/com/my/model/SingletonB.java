package com.my.model;

/**
 * @Description TODO
 * @Author marshal
 * @Date 15/4/20 4:35 PM
 */
public class SingletonB {

    private SingletonB() {}

    private static SingletonB instance = null;

    public synchronized static SingletonB getInstance() {
        if (instance == null) {
            instance = new SingletonB();
        }
        return instance;
    }
}
