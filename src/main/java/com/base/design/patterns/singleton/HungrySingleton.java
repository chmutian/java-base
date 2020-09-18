package com.base.design.patterns.singleton;

/**
 * @Description: 饿汉式
 * @author mutian
 * @date 2020年9月18日
 */
public class HungrySingleton {
	
	private static HungrySingleton INSTANCE = new HungrySingleton();
	
	public static HungrySingleton getInstance() {
		return INSTANCE;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			new Thread(()-> {
				System.out.println(HungrySingleton.getInstance());
			}).start() ;
		}
	}
}
