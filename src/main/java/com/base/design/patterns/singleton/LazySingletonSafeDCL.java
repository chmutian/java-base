package com.base.design.patterns.singleton;

/**
 * @Description: 懒汉式双重检查锁
 * @author mutian
 * @date 2020年9月18日
 */
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
