package com.base.design.patterns.decorate;

/**
 * @author :mutian
 * @date :2023/2/17
 * @description :大杯奶茶
 */
public class BigMilkTea extends DecoratorMilkTea {

    public BigMilkTea(MilkTea shape) {
        super(shape);
    }

    @Override
    public int price() {
        return super.price() + 1;
    }
}
