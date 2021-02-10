package com.base.juc.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

/**
 * 线程安全的Map
 * 
 * @author mutian
 */
public class SafeMap {

	public static void main(String[] args) {
		int n = 10000;
		testHashMap(n);
		testSynchronizedMap(n);
		testConcurrentHashMap(n);
	}

	/**
	 * HashMap
	 */
	private static void testHashMap(int n) {
		Map<Object, Object> map = new HashMap<>();
		CountDownLatch countDownLatch = new CountDownLatch(n);
		for (int i = 0; i < n; i++) {
			new Thread(() -> {
				map.put(Thread.currentThread().getName(), Thread.currentThread().getName());
				countDownLatch.countDown();
			}).start();
		}
		try {
			countDownLatch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(map.size());
	}


	/**
	 * SynchronizedMap 
	 */
	private static void testSynchronizedMap(int n) {
		Map<Object, Object> map = Collections.synchronizedMap(new HashMap<>());
		CountDownLatch countDownLatch = new CountDownLatch(n);
		for (int i = 0; i < n; i++) {
			new Thread(() -> {
				map.put(Thread.currentThread().getName(), Thread.currentThread().getName());
				countDownLatch.countDown();
			}).start();
		}
		try {
			countDownLatch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(map.size());
	}

	/**
	 * ConcurrentHashMap
	 */
	private static void testConcurrentHashMap(int n) {
		Map<Object, Object> map = new ConcurrentHashMap<Object, Object>();
		CountDownLatch countDownLatch = new CountDownLatch(n);
		for (int i = 0; i < n; i++) {
			new Thread(() -> {
				map.put(Thread.currentThread().getName(), Thread.currentThread().getName());
				countDownLatch.countDown();
			}).start();
		}
		try {
			countDownLatch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(map.size());
	}
}
