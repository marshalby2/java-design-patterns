package com.my.model;

/**
 * @Description TODO
 * @Author marshal
 * @Date 29/4/20 8:47 AM
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void invoke() {
        command.execute();
    }
}
