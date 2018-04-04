package com.tinedge.sj.singletonpattern;

public class SingletonClass { //private static 으로 자기 객체 타입 객체 할당 
    //static 이어서 객체 생성 이전에 클래스 상태에서 접근할 수 있다
	private static SingletonClass SINGLETON_CLASS_INSTANCE = new SingletonClass(); //private static 으로 
	public int i = 10;
	
	private SingletonClass() { //private 으로 생성자를 설정
		// TODO Auto-generated constructor stub
	}
	
	public static SingletonClass getSingletonClass() { //public static 으로 접근 가능하게 설정 
		
		if(SINGLETON_CLASS_INSTANCE == null) {
			SINGLETON_CLASS_INSTANCE = new SingletonClass();
		}
		
		return SINGLETON_CLASS_INSTANCE;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	
}
