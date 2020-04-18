package com.my.model;

/**
 * @Description TODO
 * @Author marshal
 * @Date 16/4/20 9:01 AM
 */
public class ConcreteFactoryA implements Factory {
    @Override
    public Product create() {
        return new ProductA();
    }
}
