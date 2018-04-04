package com.tinedge.sj.thread1;

public class MainClass {
	
	public static void main(String[] args) {
		
		ThreadTest threadTest = new ThreadTest();
		Thread thread = new Thread(threadTest, "A");
		thread.start();
		
		System.out.println("메인 쓰레드 이름 " + Thread.currentThread().getName());
		System.out.println("메인클래스");
		
	}
	
}
