package com.my.send;

/**
 * @Description TODO
 * @Author marshal
 * @Date 15/4/20 7:17 PM
 */
public class HumanTest {
    public static void main(String[] args) {

        var human = new Human("jack", 172.9f, 55.6f);
        System.out.println(human);

        var clone = human.cloe();
        System.out.println(clone);
    }
}
