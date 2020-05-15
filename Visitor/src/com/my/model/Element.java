package com.my.model;

/**
 * @Description TODO
 * @Author marshal
 * @Date 15/5/20 4:06 PM
 */
public interface Element {
    void accept(Visitor visitor);
}
