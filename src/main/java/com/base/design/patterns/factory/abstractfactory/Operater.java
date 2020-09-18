package com.base.design.patterns.factory.abstractfactory;

public class Operater {
	
	public static void main(String[] args) {
		 AbstractFactory xiaoMiFactory = new XiaoMiFactory();
		 xiaoMiFactory.getPhone().name();
		 xiaoMiFactory.getRoute().name();
		 
		 
		 AbstractFactory huaWeiFactory = new HuaWeiFactory();
		 huaWeiFactory.getPhone().name();
		 huaWeiFactory.getRoute().name();
	}

}
