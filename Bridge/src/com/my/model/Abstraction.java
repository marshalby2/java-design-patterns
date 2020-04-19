package com.my.model;

/**
 * @Description TODO
 * @Author marshal
 * @Date 18/4/20 7:09 PM
 */
public abstract class Abstraction {

    protected Implementor implementor;

    protected Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public abstract void operation();
}
