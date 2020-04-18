package com.my.model;

/**
 * @Description TODO
 * @Author marshal
 * @Date 17/4/20 3:44 PM
 */
public class Test {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new RealSubject());
        proxy.request();
    }
}
/*
========= beforeRequest ==========
This is realSubject's request method.
========= afterRequest ==========
 */
