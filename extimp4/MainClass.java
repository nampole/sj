package com.tinedge.sj.extimp4;

public class MainClass {
	
	public static void main(String[] args) {
		
		Actress actress = new Actress();
		actress.canCatchCriminal();
		actress.canSearch();
		actress.outFire();
		actress.saveMan();
		actress.makePizza();
		actress.makeSpaghetti();
		
		PoliceMan actressP = new Actress();
		actressP.canCatchCriminal();
		actressP.canSearch();
		
//		actressP.outFire();
//		actressP.saveMan();
//		actressP.makePizza();
//		actressP.makeSpaghetti();
		
		Firefighter actressF = new Actress();
		actressF.outFire();
		actressF.saveMan();
		
//		actressF.canCatchCriminal();
//		actressF.canSearch();
//		actressF.makePizza();
//		actressF.makeSpaghetti();

		
		Chef actressC = new Actress();
		actressC.makePizza();
		actressC.makeSpaghetti();

//		actressC.canCatchCriminal();
//		actressC.canSearch();
//		actressC.outFire();
//		actressC.saveMan();		
		
		
	}
	
}
