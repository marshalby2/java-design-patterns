package com.my.demo;

/**
 * @Description TODO
 * @Author marshal
 * @Date 1/5/20 4:35 PM
 */
public class Minister extends Leader{
    @Override
    public void handleRequest(int days) {
        if (days <= 7) {
            System.out.println("部长批准了您的请假： " + days + "天。");
        } else {
            if (getNext() != null ) {
                getNext().handleRequest(days);
            } else {
                System.out.println("请假时间太长，无法受理。");
            }
        }
    }
}
