package com.tinedge.sj.collection2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hsMap = new HashMap<Integer, String>();
		hsMap.put(0, "arg1");
		hsMap.put(1, "arg2");
		hsMap.put(2, "arg3");
		hsMap.put(3, "arg4");
		hsMap.put(4, "arg5");
		System.out.println(hsMap);
		System.out.println(hsMap.toString());
		
		hsMap.remove(2);
		System.out.println(hsMap);
		System.out.println(hsMap.toString());
		
		//iterator 샘플
		Iterator<Integer> itRator = hsMap.keySet().iterator();
		while (itRator.hasNext()) {
			System.out.println(hsMap.get(itRator.next()));
		}			
		
		hsMap.clear();
		System.out.println(hsMap);
		
		
		HashSet<Student> hsSet = new HashSet<Student>();
		hsSet.add (new Student ("arg1",5));
		hsSet.add (new Student ("arg2",6));
		hsSet.add (new Student ("arg3",3));
		hsSet.add (new Student ("arg4",2));
		hsSet.add (new Student ("arg5",6));
		
		System.out.println(hsSet);
		System.out.println(hsSet.toString());
		
		//기초 데이터가 아닌 사용자 객체는 지우는 방법이 해시에서... 틀리다..
		Student student = new Student("arg3",3);
		hsSet.remove(student);
		System.out.println(hsSet.toString());

		//iterator 샘플
//		Iterator<Student> itRator2 = hsSet.keySet().iterator();
//		while (itRator2.hasNext()) {
//			System.out.println(hsMap.get(itRator2.next()));
//		}			
		
		hsSet.clear();
		System.out.println(hsSet);
		
		
		
	}

}
