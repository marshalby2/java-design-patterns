package com.my.demo;

/**
 * @Description TODO
 * @Author marshal
 * @Date 17/4/20 9:40 AM
 */
public class ComputerFactory implements Factory{
    @Override
    public XiaomiProduct produceXiaomi() {
        return new XiaomiComputer();
    }

    @Override
    public HuaweiProduct produceHuawei() {
        return new HuaweiComputer();
    }
}
