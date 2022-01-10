package com.base.design.patterns.factory.simplefactory;

public class CarFactory {

	public static Car getCar(CarType type) {
		return type.getCar();
	}

}
