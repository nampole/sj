package com.tinedge.sj.thread1;

public class ThreadTest implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("서브 쓰레드 이름 " + Thread.currentThread().getName());
		System.out.println("Thread 시험");
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {}
		}
		
	}

}
