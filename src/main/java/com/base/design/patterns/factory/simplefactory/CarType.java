package com.base.design.patterns.factory.simplefactory;

import java.util.function.Supplier;

public enum CarType {

	SQUARE(Bmw::new),
	CIRCLE(Benz::new);

	private final Supplier<Car> constructor;

	CarType(Supplier<Car> constructor) {
		this.constructor = constructor;
	}

	public Supplier<Car> getConstructor() {
		return this.constructor;
	}	
}
