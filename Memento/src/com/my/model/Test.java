package com.my.model;

/**
 * @Description TODO
 * @Author marshal
 * @Date 15/5/20 3:11 PM
 */
public class Test {

    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("state #1");
        // 保存状态
        caretaker.setMemento(originator.createMemento());
        System.out.println("初始状态： " + originator.getState());

        // 设置新状态
        originator.setState("state #2");
        System.out.println("新的状态： " + originator.getState());

        // 恢复状态
        originator.restoreMemento(caretaker.getMemento());
        System.out.println("恢复状态：" + originator.getState());



    }

}
