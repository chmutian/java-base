package com.base.design.patterns.adapter;

/**
 * @author :mutian
 * @date :2023/2/22
 * @description :USBA
 */
public class USBAImpl implements USBA{

    @Override
    public void connection() {
        System.out.println("usb a 连接");
    }
}
