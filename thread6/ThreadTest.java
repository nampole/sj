package com.tinedge.sj.thread6;

public class ThreadTest implements Runnable {

	int testNum = 0;
	
	@Override
	public synchronized void run() {//싱크로나이즈드 사용 A와 B가 섞이지 않게 한다.
		for (int i = 0; i < 10; i++) {
			if(Thread.currentThread().getName().equals("A")) {
				System.out.println("====================================");
				testNum++;
			}
			System.out.println("Thread Name : " + Thread.currentThread().getName() + ", testNum : " + testNum);
			try {
				Thread.sleep(500);
			} catch (Exception e) {}
		}
	}

}
