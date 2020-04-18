package com.my.send;

/**
 * @Description TODO
 * @Author marshal
 * @Date 16/4/20 9:22 AM
 */
public class Test {
    public static void main(String[] args) {
        Provider factory = new SendEmailFactory();
        Sender sender = factory.produce();
        sender.send();
    }
}
