package com.my.demo;

/**
 * @Description TODO
 * @Author marshal
 * @Date 27/4/20 4:24 PM
 */
public class Client {
    public static void main(String[] args) {
        Daily workday = new Workday();
        workday.template();

        System.out.println("===========================");

        Daily holiday = new Holiday();
        holiday.isWorkday(false);
        holiday.template();
    }
}
