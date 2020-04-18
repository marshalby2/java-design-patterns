package com.my.model;

/**
 * @Description TODO
 * @Author marshal
 * @Date 17/4/20 3:40 PM
 */
public class RealSubject implements Subject{

    @Override
    public void request() {
        System.out.println("This is realSubject's request method.");
    }
}
