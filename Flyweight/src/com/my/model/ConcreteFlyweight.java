package com.my.model;

/**
 * @Description TODO
 * @Author marshal
 * @Date 19/4/20 9:28 PM
 */
public class ConcreteFlyweight implements Flyweight{

    private String key;

    public ConcreteFlyweight(String key) {
        this.key = key;
        System.out.println("concreteFlyweight " + key + " be created.");
    }

    @Override
    public void operation() {
        System.out.println("This is concreteFlyweight " + this.key + "'s method.");
    }
}
