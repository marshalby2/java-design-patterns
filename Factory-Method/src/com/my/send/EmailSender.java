package com.my.send;

/**
 * @Description TODO
 * @Author marshal
 * @Date 16/4/20 9:20 AM
 * /home/marshal/Documents/blog/java-design-patterns
 */
public class EmailSender implements Sender{
    @Override
    public void send() {
        System.out.println("send email");
    }
}
