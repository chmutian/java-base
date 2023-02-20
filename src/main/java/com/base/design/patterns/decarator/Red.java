package com.base.design.patterns.decarator;

/**
 * @author :mutian
 * @date :2023/2/17
 * @description :Red
 */
public class Red extends DecoratorShape {

    public Red(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("red");
    }
}
