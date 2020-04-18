package com.my.model;

/**
 * @Description TODO
 * @Author marshal
 * @Date 17/4/20 8:24 AM
 */
public abstract class Factory2 implements Factory, ProductB {
    @Override
    public ProductA produceA() {
        return new ConcreteProductA2();
    }

    @Override
    public ProductB produceB() {
        return new ConcreteProductB2();
    }
}
