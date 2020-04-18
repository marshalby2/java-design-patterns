package com.model;

/**
 * @Description TODO
 * @Author marshal
 * @Date 13/4/20 9:28 PM
 */
public class ConcreteComponent extends Component {
    @Override
    public void operation() {
        System.out.println("Concrete operation");
    }
}
