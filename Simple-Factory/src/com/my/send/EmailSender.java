package com.my.send;

/**
 * @Description TODO
 * @Author marshal
 * @Date 15/4/20 8:23 PM
 */
public class EmailSender implements Sender {
    @Override
    public void send() {
        System.out.println("This is email sender.");
    }
}
