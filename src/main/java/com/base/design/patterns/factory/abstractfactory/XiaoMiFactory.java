package com.base.design.patterns.factory.abstractfactory;

public class XiaoMiFactory implements AbstractFactory{

	@Override
	public Phone getPhone() {
		return new XiaoMiPhone();
	}

	@Override
	public Route getRoute() {
		return new XiaoMiRoute();
	}

}
