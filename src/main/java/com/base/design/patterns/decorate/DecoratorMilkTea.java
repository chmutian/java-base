package com.base.design.patterns.decorate;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author :mutian
 * @date :2023/2/17
 * @description :装饰者
 */
@NoArgsConstructor
@AllArgsConstructor
public class DecoratorMilkTea implements MilkTea {

    protected MilkTea milkTea;

    @Override
    public int price() {
        return milkTea.price();
    }
}
