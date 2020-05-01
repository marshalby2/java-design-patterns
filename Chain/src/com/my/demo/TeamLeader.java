package com.my.demo;

/**
 * @Description TODO
 * @Author marshal
 * @Date 1/5/20 4:32 PM
 */
public class TeamLeader extends Leader{
    @Override
    public void handleRequest(int days) {
        if (days <= 3) {
            System.out.println("组长批准了您的请假： " + days + "天。");
        } else {
            if (getNext() != null ) {
                getNext().handleRequest(days);
            } else {
                System.out.println("请假时间太长，无法受理。");
            }
        }
    }
}
