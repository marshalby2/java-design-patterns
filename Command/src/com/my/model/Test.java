package com.my.model;

/**
 * @Description TODO
 * @Author marshal
 * @Date 29/4/20 9:14 AM
 */
public class Test {
    public static void main(String[] args) {


        var receiverA = new ReceiverA();
        var commandA = new ConcreteCommandA(receiverA);
        var invoker = new Invoker(commandA);
        invoker.invoke();

    }
}
