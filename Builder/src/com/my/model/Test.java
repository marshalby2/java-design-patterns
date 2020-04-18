package com.my.model;

/**
 * @Description TODO
 * @Author marshal
 * @Date 17/4/20 10:29 AM
 */
public class Test {
    public static void main(String[] args) {
        var builder = new ConcreteBuilder();
        var director = new Director(builder);
        Product product = director.build();
        System.out.println(product);    // Product{partA='PartA', partB='PartB', partC='PartC'}
    }
}
