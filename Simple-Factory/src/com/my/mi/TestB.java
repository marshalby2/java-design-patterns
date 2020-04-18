package com.my.mi;

/**
 * @Description TODO
 * @Author marshal
 * @Date 16/4/20 5:56 PM
 */
public class TestB {
    public static void main(String[] args) {
        var factory = new FactoryB();
        Product product = factory.producePhone();
        product.show();
    }
}
