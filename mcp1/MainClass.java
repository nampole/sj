package com.tinedge.sj.mcp1;

public class MainClass {
	
	public static void main(String[] args) {
		
		ChildClass childClass = new ChildClass();
		ParentClass parentClass = new ParentClass();
//		System.out.println(childClass.cStr);
		System.out.println(childClass.getPname());
		System.out.println(childClass.getMname());
		
		System.out.print("아빠이름 : ");
		childClass.getPapaName();
		System.out.print("엄마이름 : ");
		childClass.getMommyName();
		
		System.out.println(parentClass.pStr);
		System.out.println(childClass.cStr);
		
	}
	
}
