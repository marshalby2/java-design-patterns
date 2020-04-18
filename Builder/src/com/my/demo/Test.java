package com.my.demo;

/**
 * @Description TODO
 * @Author marshal
 * @Date 17/4/20 10:54 AM
 */
public class Test {
    public static void main(String[] args) {
        var xiaomiComputer = new Director(new XiaomiComputerBuilder()).build();
        System.out.println(xiaomiComputer); // Computer{band='Xiaomi', cpu='8G', memory='null', disk='500G', size='13'}
        var huaweiComputer = new Director(new HuaweiComputerBuilder()).build();
        System.out.println(huaweiComputer); // Computer{band='Huawei', cpu='i7 8500U', memory='8G', disk='1T', size='15.6'}
    }
}
