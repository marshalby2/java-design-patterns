package com.my.mi;

/**
 * @Description TODO
 * @Author marshal
 * @Date 16/4/20 5:50 PM
 */
public class Factory {
    public Product produce(String type) {
        if ("phone".equals(type)) {
            return new Phone();
        } else if ("computer".equals(type)) {
            return new Computer();
        } else {
            System.out.println("Please input correct type.");
            return null;
        }
    }
}