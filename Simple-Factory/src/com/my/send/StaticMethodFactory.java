package com.my.send;

/**
 * @Description TODO
 * @Author marshal
 * @Date 15/4/20 9:08 PM
 */
public class StaticMethodFactory {
    public static Sender produceSmsSender() {
        return new SmsSender();
    }

    public static Sender produceEmailSender() {
        return new EmailSender();
    }
}
