package com.my.model;

/**
 * @Description TODO
 * @Author marshal
 * @Date 17/4/20 10:25 AM
 */
public class ConcreteBuilder implements Builder{

    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.setPartA("PartA");
    }

    @Override
    public void buildPartB() {
        product.setPartB("PartB");
    }

    @Override
    public void buildPartC() {
        product.setPartC("PartC");
    }

    @Override
    public Product buildProduct() {
        return product;
    }
}
