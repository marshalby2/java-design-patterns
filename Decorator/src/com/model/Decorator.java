package com.model;

/**
 * @Description TODO
 * @Author marshal
 * @Date 13/4/20 9:29 PM
 */
public class Decorator extends Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        // 调用被装饰对象的方法
        component.operation();
    }
}
