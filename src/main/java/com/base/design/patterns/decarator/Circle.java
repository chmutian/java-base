package com.base.design.patterns.decarator;

/**
 * @author :mutian
 * @date :2023/2/17
 * @description :Circle
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("circle");
    }

    public static void main(String[] args) {
        new Blue(new Circle()).draw();
        new Blue(new Red(new Circle())).draw();
    }
}
