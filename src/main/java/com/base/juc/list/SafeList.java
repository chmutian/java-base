package com.base.juc.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;

/**
 * 线程安全的list
 * @author mutian
 */
public class SafeList {

	public static void main(String[] args) {
		int n = 10000;
		testArrayList(n);
		testVector(n);
		testSynchronizedList(n);
		testCopyOnWriteArrayList(n);
	}
	
	/**
	 * ArrayList 线程不安全
	 */
	private static void testArrayList(int n) {
		List<String> list = new ArrayList<String>();
		CountDownLatch countDownLatch = new CountDownLatch(n);
		for (int i = 0; i < n; i++) {
			new Thread(() -> {
				list.add(Thread.currentThread().getName());
				countDownLatch.countDown();
			}).start();
		}
		try {
			countDownLatch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(list.size());
	}
	
	/**
	 * Vector 线程安全
	 * 读写通过synchronized同步方法保证线程安全
	 */
	private static void testVector(int n) {
		List<String> list = new Vector<String>();
		CountDownLatch countDownLatch = new CountDownLatch(n);
		for (int i = 0; i < n; i++) {
			new Thread(() -> {
				list.add(Thread.currentThread().getName());
				countDownLatch.countDown();
			}).start();
		}
		try {
			countDownLatch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(list.size());
	}
	
	/**
	 * Vector 线程安全
	 * 读写通过synchronized同步代码块保证线程安全
	 */
	private static void testSynchronizedList(int n) {
		List<String> list = Collections.synchronizedList(new ArrayList<String>());
		CountDownLatch countDownLatch = new CountDownLatch(n);
		for (int i = 0; i < n; i++) {
			new Thread(() -> {
				list.add(Thread.currentThread().getName());
				countDownLatch.countDown();
			}).start();
		}
		try {
			countDownLatch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(list.size());
	}
	
	/**
	 * CopyOnWriteArrayList 写时复制思想，写加锁，读不加锁，适合读多写少的场景
	 */
	private static void testCopyOnWriteArrayList(int n) {
		List<String> list = new CopyOnWriteArrayList<String>();
		CountDownLatch countDownLatch = new CountDownLatch(n);
		for (int i = 0; i < n; i++) {
			new Thread(() -> {
				list.add(Thread.currentThread().getName());
				countDownLatch.countDown();
			}).start();
		}
		try {
			countDownLatch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(list.size());
	}
}
