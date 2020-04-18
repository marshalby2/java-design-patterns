package com.my.mi;

/**
 * @Description TODO
 * @Author marshal
 * @Date 16/4/20 5:54 PM
 */
public class FactoryB {

    public Product producePhone() {
        return new Phone();
    }

    public Product produceComputer() {
        return new Computer();
    }

}
