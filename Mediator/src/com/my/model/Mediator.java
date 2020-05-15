package com.my.model;

/**
 * @Description TODO
 * @Author marshal
 * @Date 15/5/20 9:46 AM
 */
public interface Mediator {

    /**
     *  注册
     *
     * @param colleague
     */
    void register(Colleague colleague);

    /**
     *  传送
     *
     * @param colleague
     */
    void relay(Colleague colleague);

}
