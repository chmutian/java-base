package com.base.design.patterns.singleton;

/**
 * @Description: 懒汉式线程不安全
 * @author mutian
 * @date 2020年9月18日
 */
public class LazySingletonNotSafe {
	
	private static LazySingletonNotSafe INSTANCE;
	
	public static LazySingletonNotSafe getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new LazySingletonNotSafe();
		}
		return INSTANCE;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			new Thread(()-> {
				System.out.println(LazySingletonNotSafe.getInstance());
			}).start() ;
		}
	}
}
