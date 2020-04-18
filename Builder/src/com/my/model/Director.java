package com.my.model;

/**
 * @Description TODO
 * @Author marshal
 * @Date 17/4/20 10:26 AM
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Product build() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();

        return builder.buildProduct();
    }

}
