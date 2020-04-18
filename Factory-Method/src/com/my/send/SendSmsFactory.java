package com.my.send;

/**
 * @Description TODO
 * @Author marshal
 * @Date 16/4/20 9:21 AM
 */
public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
