package com.my.demo;

import com.my.model.Product;

/**
 * @Description TODO
 * @Author marshal
 * @Date 17/4/20 10:45 AM
 */
public class HuaweiComputerBuilder implements Builder{
    private Computer computer = new Computer();

    @Override
    public void setBand() {
        computer.setBand("Huawei");
    }

    @Override
    public void setCpu() {
        computer.setCpu("i7 8500U");
    }

    @Override
    public void setMemory() {
        computer.setMemory("8G");
    }

    @Override
    public void setDisk() {
        computer.setDisk("1T");
    }

    @Override
    public void setSize() {
        computer.setSize("15.6");
    }

    @Override
    public Computer buildProduct() {
        return computer;
    }
}
