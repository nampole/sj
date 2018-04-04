package com.tinedge.sj.collection2;

public class Student {

	private String name;
	private int grade;
	
	public Student (String name, int grade) {
		this.name=name;
		this.grade=grade;
	}
	
	public String toString() {
		return name + " : " + grade + " 학년";
	}
	
	public boolean equals(Object obj) {
		String compareValue = obj.toString();
		String thisValue = toString();
		return thisValue.equals(compareValue);
	}
	
	
	public int hashCode() {
		return toString().hashCode();
		
	}
}
