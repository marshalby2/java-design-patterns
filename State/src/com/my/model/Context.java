package com.my.model;

/**
 * @Description TODO
 * @Author marshal
 * @Date 15/5/20 6:48 PM
 */
public class Context {

    private State state;

    public Context() {
        this.state = new ConcreteStateA();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void handle() {
        state.handle(this);
    }
}
