package com.tinedge.sj.singletonpattern;

public class MainClass {

	public static void main(String[] args) {
		
		FirstClass firstClass = new FirstClass();  //200 증가
		SecondClass secondClass = new SecondClass(); //first 가 200 증가 시킨 값 반영
		
	}
	
}
