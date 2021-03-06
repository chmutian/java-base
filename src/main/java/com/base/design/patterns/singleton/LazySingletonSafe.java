package com.base.design.patterns.singleton;

/**
 * @Description: 懒汉式线程安全
 * @author mutian
 * @date 2020年9月18日
 */
public class LazySingletonSafe {
	
	private static LazySingletonSafe INSTANCE;
	
	public static synchronized LazySingletonSafe getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new LazySingletonSafe();
		}
		return INSTANCE;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			new Thread(()-> {
				System.out.println(LazySingletonSafe.getInstance());
			}).start() ;
		}
	}
}
