package com.my.mi;

/**
 * @Description TODO
 * @Author marshal
 * @Date 16/4/20 5:55 PM
 */
public class FactoryC {

    public static Product producePhone() {
        return new Phone();
    }

    public static Product produceComputer() {
        return new Computer();
    }

}
