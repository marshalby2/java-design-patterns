package com.my.demo;

/**
 * @Description TODO
 * @Author marshal
 * @Date 17/4/20 9:39 AM
 */
public class Test {
    public static void main(String[] args) {

        var factory = new ComputerFactory();
        var huaweiComputer = factory.produceHuawei();
        var xiaomiComputer = factory.produceXiaomi();
        huaweiComputer.show();  // This is Huawei computer.
        xiaomiComputer.show();  // This is Xiaomi Computer.


    }
}
