package com.my.demo;

/**
 * @Description TODO
 * @Author marshal
 * @Date 17/4/20 10:49 AM
 */
public class XiaomiComputerBuilder implements Builder{

    private Computer computer = new Computer();

    @Override
    public void setBand() {
        computer.setBand("Xiaomi");
    }

    @Override
    public void setCpu() {
        computer.setCpu("i5 8300H");
    }

    @Override
    public void setMemory() {
        computer.setCpu("8G");
    }

    @Override
    public void setDisk() {
        computer.setDisk("500G");
    }

    @Override
    public void setSize() {
        computer.setSize("13");
    }

    @Override
    public Computer buildProduct() {
        return computer;
    }
}
