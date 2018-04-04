package com.tinedge.sj.mcp1;

public class ParentClass {
	
	String pStr = "부모클래스";
	
	public ParentClass() {
		// TODO Auto-generated constructor stub
	}
	
	public void getPapaName() {
		System.out.println("아빠");
	}
	
	public void getMommyName() {
		System.out.println("엄마");
	}
	
	public String getPname() {
		System.out.println("papa");
		return "P~~";
	}
	
	public int getMname() {
		System.out.println("mommy");
		return 100;
	}
	
}
