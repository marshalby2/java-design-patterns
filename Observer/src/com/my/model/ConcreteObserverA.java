package com.my.model;

/**
 * @Description TODO
 * @Author marshal
 * @Date 15/5/20 2:36 PM
 */
public class ConcreteObserverA implements Observer{

    @Override
    public void response() {
        System.out.println("ConcreteObserverA received.");
    }
}
