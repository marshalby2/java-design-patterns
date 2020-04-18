package com.my.send;

/**
 * @Description TODO
 * @Author marshal
 * @Date 15/4/20 8:24 PM
 */
public class SendFactory {
    public Sender produce(String type) {
        if ("sms".equals(type)) {
            return new SmsSender();
        } else if ("email".equals(type)) {
            return new EmailSender();
        } else {
            System.out.println("Please input correct type");
            return null;
        }
    }
}
