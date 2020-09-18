package com.base.design.patterns.factory.factorymethod;

public class Operater {
	
	public static void main(String[] args) {
		CarFactory benzFactory = new BenzFactory();
		benzFactory.createCar().driver();
		
		CarFactory bmwFactory = new BmwFactory();
		bmwFactory.createCar().driver();
	}

}
