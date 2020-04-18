package com.my.model;

/**
 * @Description TODO
 * @Author marshal
 * @Date 17/4/20 8:24 AM
 */
public class Factory1 implements Factory{
    @Override
    public ProductA produceA() {
        return new ConcreteProductA1();
    }

    @Override
    public ProductB produceB() {
        return new ConcreteProductB1();
    }
}
