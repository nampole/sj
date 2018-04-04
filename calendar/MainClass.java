package com.tinedge.sj.calendar;

import java.util.Calendar;

public class MainClass {
	public static void main(String[] args) {
		
		//객체형 ... 메쏘드로 생성 싱글턴으로 되어 있는것 같음
		Calendar calendar = Calendar.getInstance();   
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1;
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		
		System.out.println("일자 : " + year + " 년 " + month + " 월 " + day + " 일");
		System.out.println("시간 : " + hour + " hour " + minute + " minute " + second + " second");
		
	}
}
