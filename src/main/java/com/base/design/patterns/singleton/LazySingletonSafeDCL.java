package com.base.design.patterns.singleton;

public class LazySingletonSafeDCL {
	
	private static volatile LazySingletonSafeDCL INSTANCE;
	
	public static LazySingletonSafeDCL getInstance() {
		if (INSTANCE == null) {
			synchronized (LazySingletonSafeDCL.class) {
				if (INSTANCE == null) {
					INSTANCE = new LazySingletonSafeDCL();
				}
			}
		}
		return INSTANCE;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			new Thread(()-> {
				System.out.println(LazySingletonSafeDCL.getInstance());
			}).start() ;
		}
	}
}
