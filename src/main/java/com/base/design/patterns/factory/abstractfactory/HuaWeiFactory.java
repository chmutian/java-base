package com.base.design.patterns.factory.abstractfactory;

public class HuaWeiFactory implements AbstractFactory{
	
	@Override
	public Phone getPhone() {
		return new HuaWeiPhone();
	}

	@Override
	public Route getRoute() {
		return new HuaWeiRoute();
	}

}
