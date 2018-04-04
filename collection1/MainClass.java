package com.tinedge.sj.collection1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arList = new ArrayList<String> ();
		arList.add("str0");
		arList.add("str1");
		arList.add("str2");
		arList.add("str3");
		arList.add("str4");
		System.out.println(arList.toString());	
		
		arList.set(2,"대한민국");
		System.out.println(arList.toString());
		
		arList.remove(3);
		System.out.println(arList.toString());	

		System.out.println(arList.size());
		
		arList.clear();
		System.out.println(arList.toString());	

		arList=null; //객체를 없애버림 ~~~ null 되고 그것으로 무엇하려면 null pointer exception 
		System.out.println(arList);	
		try {
		System.out.println(arList.toString());
		} catch (Exception e){
			System.out.println("객체를 없애버림 ~~~ null 되고 그것으로 무엇하려면 null pointer exception.^^");
		};

		LinkedList<String> lnList = new LinkedList<String> ();

		lnList.add("str0");
		lnList.add("str1");
		lnList.add("str2");
		lnList.add("str3");
		lnList.add("str4");
		lnList.add(1, "str2"); // *** 삽입시 위치를 지정함.
		System.out.println(lnList.toString());	
		
		lnList.set(2,"영국");   // *** 위치를 지정하여 수정.
		System.out.println(lnList.toString());
		
		lnList.remove(3);
		System.out.println(lnList.toString());	

		System.out.println(lnList.size());
		
		lnList.clear();
		System.out.println(lnList.toString());	

		lnList=null; //객체를 없애버림 
		System.out.println(lnList);	
		try {
		System.out.println(lnList.toString());
		} catch (Exception e) {
			System.out.println(e);
		}

		
		Vector<String> vctr= new Vector<String> ();
		vctr.add("str0");
		vctr.add("str1");
		vctr.add("str2");
		vctr.add("str3");
		vctr.add("str4");
		vctr.add(1, "str2"); // *** 삽입시 위치를 지정함.
		System.out.println(vctr.toString());			

		vctr.set(2,"미국");   // *** 위치를 지정하여 수정.
		System.out.println(vctr.toString());
		
		vctr.remove(3);
		System.out.println(vctr.toString());	

		System.out.println(vctr.size());
		
		vctr.clear();
		System.out.println(vctr.toString());	

		vctr=null; //객체를 없애버림 
		System.out.println(vctr);	
		try {
		System.out.println(vctr.toString());
		} catch (Exception e) {
			System.out.println("벡터 null 처리시 예외");
			}
		}
}
