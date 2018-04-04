package com.tinedge.sj.singletonpattern;

public class FirstClass {
	public FirstClass() {
		// TODO Auto-generated constructor stub
		
		SingletonClass singletonClass = SingletonClass.getSingletonClass(); //싱글턴에 접근하기 때문에 생성자를 이용하지 않고 메쏘드를 이용
		System.out.println("FirstClass"); //싱글턴에 원래 설정된 i 값
		System.out.println("i = " + singletonClass.getI());
		singletonClass.setI(200); //싱글턴의 method 로 i 값 변경 셋
		System.out.println("i = " + singletonClass.getI()); //싱글턴의 method 로 i 값 확인
		
	}
}
