package com.my.mi;

/**
 * @Description TODO
 * @Author marshal
 * @Date 16/4/20 10:48 PM
 */
public class ComputerFactory implements Factory {
    @Override
    public Product produce() {
        return new Computer();
    }
}
