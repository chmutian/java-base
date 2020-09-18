package com.base.design.patterns.singleton;

/**
 * @Description: 匿名内部类
 * @author mutian
 * @date 2020年9月18日
 */
public class AnonymousInnerClassSingleton {
	
	private static class SingletonHolder {
		private static final AnonymousInnerClassSingleton INSTANCE = new AnonymousInnerClassSingleton();
	}
	
	public static AnonymousInnerClassSingleton getInstance() {
		return SingletonHolder.INSTANCE;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			new Thread(()-> {
				System.out.println(AnonymousInnerClassSingleton.getInstance());
			}).start() ;
		}
	}
}
