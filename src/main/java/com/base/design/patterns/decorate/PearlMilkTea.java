package com.base.design.patterns.decorate;

/**
 * @author :mutian
 * @date :2023/2/17
 * @description :珍珠奶茶
 */
public class PearlMilkTea extends DecoratorMilkTea {

    public PearlMilkTea(MilkTea shape) {
        super(shape);
    }

    @Override
    public int price() {
        return super.price() + 3;
    }
}
