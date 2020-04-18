package com.my.mi;

/**
 * @Description TODO
 * @Author marshal
 * @Date 16/4/20 10:49 PM
 */
public class Test {
    public static void main(String[] args) {
        var factory = new PhoneFactory();
        var phone = factory.produce();
        phone.show(); // This is phone.
    }
}
