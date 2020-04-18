package com.my.send;

/**
 * @Description TODO
 * @Author marshal
 * @Date 15/4/20 8:57 PM
 */
public class MutiMethodFactory {

    public Sender produceSmsSender() {
        return new SmsSender();
    }

    public Sender produceEmailSender() {
        return new EmailSender();
    }
}
