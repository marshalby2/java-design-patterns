package com.my.model;

/**
 * @Description TODO
 * @Author marshal
 * @Date 15/5/20 9:48 AM
 */
public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    /**
     *  接收消息
     *
     */
    public abstract void receive();

    /**
     *  发送消息
     *
     */
    public abstract void send();

}
