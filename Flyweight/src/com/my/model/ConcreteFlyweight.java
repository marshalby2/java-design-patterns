package com.my.model;

/**
 * @Description TODO
 * @Author marshal
 * @Date 19/4/20 9:28 PM
 */
public class ConcreteFlyweightA implements Flyweight{

    private String key;

    public ConcreteFlyweightA(String key) {
        this.key = key;
    }

    @Override
    public void operation() {
        System.out.println("This is concreteFlyweightA's method.");
    }
}
