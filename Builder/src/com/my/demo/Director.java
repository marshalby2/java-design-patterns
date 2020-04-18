package com.my.demo;


/**
 * @Description TODO
 * @Author marshal
 * @Date 17/4/20 10:45 AM
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Computer build() {
        builder.setBand();
        builder.setCpu();
        builder.setDisk();
        builder.setMemory();
        builder.setSize();
        return builder.buildProduct();
    }

}
