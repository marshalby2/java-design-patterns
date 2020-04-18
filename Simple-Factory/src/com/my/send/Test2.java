package com.my.send;

/**
 * @Description TODO
 * @Author marshal
 * @Date 15/4/20 8:59 PM
 */
public class Test2 {
    public static void main(String[] args) {
        var factory = new MutiMethodFactory();
        factory.produceSmsSender().send();
        factory.produceEmailSender().send();
    }
}
