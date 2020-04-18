package com.my.mi;

/**
 * @Description TODO
 * @Author marshal
 * @Date 16/4/20 5:55 PM
 */
public class Test {
    public static void main(String[] args) {
        var factory = new Factory();
        Product product = factory.produce("phone");
        product.show();
    }
}
