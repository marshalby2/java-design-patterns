package com.my.demo;

/**
 * @Description TODO
 * @Author marshal
 * @Date 17/4/20 9:37 AM
 */
public class PhoneFactory implements Factory{
    @Override
    public XiaomiProduct produceXiaomi() {
        return new XiaomiPhone();
    }

    @Override
    public HuaweiProduct produceHuawei() {
        return new HuaweiPhone();
    }
}
