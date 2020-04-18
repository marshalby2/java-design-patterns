package com.my.demo;

import com.my.model.Product;

/**
 * @Description TODO
 * @Author marshal
 * @Date 17/4/20 10:41 AM
 */
public interface Builder {
    void setBand();
    void setCpu();
    void setMemory();
    void setDisk();
    void setSize();

    Computer buildProduct();
}
