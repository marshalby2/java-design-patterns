package com.my.model;

/**
 * 具体命令A，由接受者A执行命令
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
