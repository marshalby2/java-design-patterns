package com.my.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Author marshal
 * @Date 18/4/20 2:45 PM
 */
public class Composite  implements Component{

    private ArrayList<Component> components = new ArrayList<>();

    public void add(Component component) {
        this.components.add(component);
    }

    public void remove(Component component) {
        this.components.remove(component);
    }

    public ArrayList<Component> getChildren() {
        return this.components;
    }


    @Override
    public void operation() {

    }
}
