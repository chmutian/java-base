package com.base.design.patterns.factory.factorymethod;

public class BmwFactory implements CarFactory {

	@Override
	public Car createCar() {
		return new Bmw();
	}

}
