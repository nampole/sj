package com.tinedge.sj.stringbuilder;

public class MainClass {
	public static void main(String[] args) {
		
		System.out.println(System.currentTimeMillis());
		
		String str = "A";
		long startNum = System.currentTimeMillis();
		
		for (int i = 0; i < 50000; i++) {
			str = str + "A";
//			System.out.println(str);
		}
		
		long endNum = System.currentTimeMillis();
//		System.out.println(str);
		System.out.println("스트링경과시간 : " + (endNum - startNum));
		
		
		StringBuilder stringBuilder = new StringBuilder("A");
		long startNum1 = System.currentTimeMillis();
		
		for (int i = 0; i < 50000; i++) {
			stringBuilder = stringBuilder.append("A");
//			System.out.println(stringBuilder);
		}
		
		long endNum1 = System.currentTimeMillis();
//		System.out.println(stringBuilder);
		System.out.println("스트링빌더 경과시간 : " + (endNum1 - startNum1));
	}
}
