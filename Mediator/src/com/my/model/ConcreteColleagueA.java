package com.my.model;

/**
 * @Description TODO
 * @Author marshal
 * @Date 15/5/20 10:08 AM
 */
public class ConcreteColleagueA extends Colleague{

    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive() {
        System.out.println("ConcreteColleagueA receive.");
    }

    @Override
    public void send() {
        System.out.println("ConcreteColleagueA send.");
        // 传送给所有人
        mediator.relay(this);
    }
}
