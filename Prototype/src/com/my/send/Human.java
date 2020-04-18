package com.my.send;

/**
 * @Description TODO
 * @Author marshal
 * @Date 15/4/20 5:22 PM
 */
public class Human implements Cloneable {

    public Human cloe() {
        Human human = null;
        try {
             human = (Human) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return human;
    }

    private String name;
    private float height;
    private float weight;

    public Human(String name, float height, float weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
