package com.tinedge.sj.mcp2;

public class ChildMenu extends ParentMenu {
	
	public ChildMenu() {   //최초 페이런트 한번 부르고 익스텐드 하니까... 그다음은 생성자에서 이벤ㅌ 있을때마다 계속 페이런트 부른다??
		// TODO Auto-generated constructor stub
		System.out.println("child 생성자");
		super.makeChungGukJang();
		makeChungGukJang();
	}
	
	private void makeBeefChungGukJang() {
		// TODO Auto-generated method stub
		System.out.println("소고기청국장");
	}
	
	public void makeHotDoenJangGuk() {
		// TODO Auto-generated method stub
		System.out.println("매운된장국");
	}
	
	public void makeKongNaMool() {
		// TODO Auto-generated method stub
		System.out.println("콩나물국");
	}
	
	public void makeChungGukJang() {
		System.out.println("순한청국장");
	}
}
