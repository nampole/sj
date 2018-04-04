package com.tinedge.sj.extimp5;

public class MainClass {
	public static void main(String[] args) {
		//생성만 해도 각 객체의 생성자에서 오버라이드 된 메쏘드 실행
		Toy pooh = new PoohToyClass(); 
		Toy mazinger = new MazingerToyClass();
		Toy airPlaneToy = new AirPlaneToyClass();
		
	}
}
