package com.base.design.patterns.singleton;

public enum EnumSingleton {
	
	INSTANCE;

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			new Thread(()-> {
				System.out.println(EnumSingleton.INSTANCE);
			}).start() ;
		}
	}
	
}
