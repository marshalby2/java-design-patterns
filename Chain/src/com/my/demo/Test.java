package com.my.demo;

/**
 * @Description TODO
 * @Author marshal
 * @Date 1/5/20 4:39 PM
 */
public class Test {
    public static void main(String[] args) {
        var teamLeader = new TeamLeader();
        var minister = new Minister();
        var manager = new Manager();

        teamLeader.setNext(manager);
        minister.setNext(manager);

        // 请假
        teamLeader.handleRequest(2); // 组长批准了您的请假： 2天。
        teamLeader.handleRequest(9); // 经理批准了您的请假： 9天。
    }
}
