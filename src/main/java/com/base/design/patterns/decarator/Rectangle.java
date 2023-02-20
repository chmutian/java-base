package com.base.design.patterns.decarator;

/**
 * @author :mutian
 * @date :2023/2/17
 * @description :Rectangle
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle");
    }

    public static void main(String[] args) {
        new Red(new Rectangle()).draw();
        new Red(new Blue(new Rectangle())).draw();
    }
}
