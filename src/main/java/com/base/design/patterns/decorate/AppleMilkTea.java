package com.base.design.patterns.decorate;

/**
 * @author :mutian
 * @date :2023/2/17
 * @description :苹果奶茶
 */
public class AppleMilkTea extends DecoratorMilkTea {

    public AppleMilkTea(MilkTea shape) {
        super(shape);
    }

    @Override
    public int price() {
        return super.price() + 2;
    }
}
