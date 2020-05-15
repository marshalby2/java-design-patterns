package com.my.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Author marshal
 * @Date 15/5/20 2:26 PM
 */
public interface Subject {

    void add(Observer observer);

    void remove (Observer observer);

    void notifyObservers();

}
