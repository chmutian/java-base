package com.base.design.patterns.decarator;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author :mutian
 * @date :2023/2/17
 * @description :DecoratorShape
 */
@NoArgsConstructor
@AllArgsConstructor
public class DecoratorShape implements Shape {

    protected Shape shape;

    @Override
    public void draw() {
        shape.draw();
    }
}
