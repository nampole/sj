package com.tinedge.sj.thread2;

public class ThreadTest extends Thread {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("쓰레드테스트");
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {}
		}
	}
	
}
