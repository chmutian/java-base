package com.base.design.patterns.factory.simplefactory;

public class Operater {
	
	public static void main(String[] args) {
		Car car1 = CarFactory.getCar(CarType.CIRCLE);
		car1.driver();
		Car car2 = CarFactory.getCar(CarType.SQUARE);
		car2.driver();
	}

}
