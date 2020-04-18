package com.my.model;

/**
 * @Description TODO
 * @Author marshal
 * @Date 17/4/20 3:42 PM
 */
public class Proxy implements Subject{

    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        beforeRequest();
        subject.request();
        afterRequest();
    }

    private void beforeRequest() {
        System.out.println("========= beforeRequest ==========");
    }

    private void afterRequest() {
        System.out.println("========= afterRequest ==========");
    }
}
