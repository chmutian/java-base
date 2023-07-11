package com.base.design.patterns.decorate;

/**
 * @author :mutian
 * @date :2023/2/17
 * @description :普通奶茶
 */
public class GeneralMilkTea implements MilkTea {

    @Override
    public int price() {
        return 10;
    }

    public static void main(String[] args) {
        System.out.println(new PearlMilkTea(new BigMilkTea(new GeneralMilkTea())).price());
    }
}
