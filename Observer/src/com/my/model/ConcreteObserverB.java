package com.my.model;

/**
 * @Description TODO
 * @Author marshal
 * @Date 15/5/20 2:36 PM
 */
public class ConcreteObserverB implements Observer{
    @Override
    public void response() {
        System.out.println("ConcreteObserverB received.");
    }
}
