package com.my.model;

/**
 * @Description TODO
 * @Author marshal
 * @Date 29/4/20 8:49 AM
 */
public class ConcreteCommandB implements Command{

    private ReceiverB receiverB;

    public ConcreteCommandB(ReceiverB receiverB) {
        this.receiverB = receiverB;
    }

    @Override
    public void execute() {
        receiverB.execute();
    }
}
