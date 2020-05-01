package com.my.demo;

/**
 * @Description TODO
 * @Author marshal
 * @Date 1/5/20 4:30 PM
 */
public abstract class Leader {
    private Leader next;

    public Leader getNext() {
        return next;
    }

    public void setNext(Leader next) {
        this.next = next;
    }

    public abstract void handleRequest(int days);
}
