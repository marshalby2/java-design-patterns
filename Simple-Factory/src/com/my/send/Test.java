package com.my.send;

/**
 * @Description TODO
 * @Author marshal
 * @Date 15/4/20 8:27 PM
 */
public class Test {
    public static void main(String[] args) {
        var factory = new SendFactory();
        Sender sms = factory.produce("sms");
        sms.send();
        Sender email = factory.produce("email");
        email.send();
    }
}
