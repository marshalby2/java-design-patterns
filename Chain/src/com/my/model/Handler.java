package com.my.model;

/**
 * @Description TODO
 * @Author marshal
 * @Date 29/4/20 2:48 PM
 */
public abstract class Handler {

    private Handler handler;

    public Handler(Handler handler) {
        this.handler = handler;
    }

    public abstract void process();
}
