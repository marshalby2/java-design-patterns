package com.my.model;

/**
 * @Description TODO
 * @Author marshal
 * @Date 17/4/20 10:20 AM
 */
public class Product {
    private String partA;
    private String partB;
    private String partC;


    public void setPartA(String partA) {
        this.partA = partA;
    }


    public void setPartB(String partB) {
        this.partB = partB;
    }


    public void setPartC(String partC) {
        this.partC = partC;
    }

    @Override
    public String toString() {
        return "Product{" +
                "partA='" + partA + '\'' +
                ", partB='" + partB + '\'' +
                ", partC='" + partC + '\'' +
                '}';
    }
}
