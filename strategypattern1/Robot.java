package com.tinedge.sj.strategypattern1;

import com.tinedge.sj.strategypattern2.FireAction;
import com.tinedge.sj.strategypattern2.FlyAction;
import com.tinedge.sj.strategypattern2.KnifeAction;

public abstract class Robot {  //로봇의 공통기능을 모아서 추상클래스로 생성
	
	public FlyAction flyAction;
	public FireAction fireAction;
	public KnifeAction knifeAction;
	
	public Robot() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract void shape();
	
	public void actionFly() {
		// TODO Auto-generated method stub
		flyAction.fly();
	}
	
	public void actionFire() {
		// TODO Auto-generated method stub
		fireAction.fire();
	}
	
	public void actionKnife() {
		// TODO Auto-generated method stub
		knifeAction.knife();
	}
	
	public void actionBasic() {
		// TODO Auto-generated method stub
		System.out.println("걸을 수 있습니다.");
	}

	public void setFlyAction(FlyAction flyAction) {
		this.flyAction = flyAction;
	}

	public void setFireAction(FireAction fireAction) {
		this.fireAction = fireAction;
	}

	public void setKnifeAction(KnifeAction knifeAction) {
		this.knifeAction = knifeAction;
	}
	
	
}
