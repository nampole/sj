package com.tinedge.sj.mcp2;


public class MainClass {
	public static void main(String[] args) {

		ParentMenu pMenu = new ParentMenu();
		ParentMenu cMenu = new ChildMenu();
		ChildMenu lMenu = new ChildMenu();

		
		pMenu.makeChungGukJang();
		cMenu.makeChungGukJang();
		cMenu.makeDoenJangGuk();
		cMenu.makeGalbiJjim();   //자식 객체에서 갈비 없는데 부보타입의 자식객체에서 호출됨
		
		      
		lMenu.makeHotDoenJangGuk();
		lMenu.makeKongNaMool();      // 부모 타입의 자식객체에서 자식에만 있는 메쏘드 호출하면 오류발생 ???

		cMenu.MakeSoybean();
		lMenu.MakeSoybean();   //자식 객체에서 없는 메쏘드 호출하면 부모에서 호출됨 ???
		
	}
}
