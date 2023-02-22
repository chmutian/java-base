package com.base.design.patterns.adapter;

import lombok.AllArgsConstructor;

/**
 * @author :mutian
 * @date :2023/2/22
 * @description :USBAdapter
 */
@AllArgsConstructor
public class USBAdapter implements USBC {

    private USBA usba;

    @Override
    public void connection() {
        usba.connection();
        System.out.println("进行适配");
        System.out.println("usb c 连接");
    }

    public static void main(String[] args) {
        new USBAdapter(new USBAImpl()).connection();
    }
}
