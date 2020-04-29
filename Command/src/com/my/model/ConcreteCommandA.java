package com.my.model;

/**
 * @Description TODO
 * @Author marshal
 * @Date 29/4/20 8:49 AM
 */
public class ConcreteCommandA implements Command{

    private ReceiverA receiverA;

    public ConcreteCommandA(ReceiverA receiverA) {
        this.receiverA = receiverA;
    }

    @Override
    public void execute() {
        receiverA.execute();
    }
}
