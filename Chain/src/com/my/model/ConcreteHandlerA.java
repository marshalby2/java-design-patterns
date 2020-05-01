package com.my.model;

/**
 * @Description TODO
 * @Author marshal
 * @Date 29/4/20 2:49 PM
 */
public class ConcreteHandlerA extends Handler{
    public ConcreteHandlerA(Handler handler) {
        super(handler);
    }

    @Override
    public void process() {
        System.out.println("This is ConcreteHandlerB's method.");
    }
}
