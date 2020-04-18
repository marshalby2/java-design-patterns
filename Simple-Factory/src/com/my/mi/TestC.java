package com.my.mi;

/**
 * @Description TODO
 * @Author marshal
 * @Date 16/4/20 5:58 PM
 */
public class TestC {
    public static void main(String[] args) {
        var product = FactoryC.producePhone();
        product.show();
    }
}
