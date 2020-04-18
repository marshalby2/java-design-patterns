package com.my.send;

/**
 * @Description TODO
 * @Author marshal
 * @Date 15/4/20 9:08 PM
 */
public class Test3 {
    public static void main(String[] args) {
        StaticMethodFactory.produceSmsSender().send();
        StaticMethodFactory.produceEmailSender().send();
    }
}
