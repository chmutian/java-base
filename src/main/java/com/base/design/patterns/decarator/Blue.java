package com.base.design.patterns.decarator;

/**
 * @author :mutian
 * @date :2023/2/17
 * @description :Blue
 */
public class Blue extends DecoratorShape {

    public Blue(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("blue");
    }
}
