package com.my.model;

/**
 * @Description TODO
 * @Author marshal
 * @Date 15/5/20 6:52 PM
 */
public class ConcreteStateA implements State{
    @Override
    public void handle(Context context) {
        System.out.println("current state is A.");
        context.setState(new ConcreteStateB());
    }
}
