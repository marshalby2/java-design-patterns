package com.my.send;

/**
 * @Description TODO
 * @Author marshal
 * @Date 16/4/20 9:20 AM
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("sms sender");
    }
}
