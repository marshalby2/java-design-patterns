package com.my.send;

/**
 * @Description TODO
 * @Author marshal
 * @Date 15/4/20 8:22 PM
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("This is sms sender.");
    }
}
