package com.tinedge.sj.strategypattern1;

import com.tinedge.sj.strategypattern2.FireOk;
import com.tinedge.sj.strategypattern2.FlyOk;
import com.tinedge.sj.strategypattern2.KnifeWithLazer;

public class SuperRobot extends Robot {

	public SuperRobot() {
		// TODO Auto-generated constructor stub
		flyAction = new FlyOk();
		fireAction = new FireOk();
		knifeAction = new KnifeWithLazer();
	}
	
	@Override
	public void shape() {
		// TODO Auto-generated method stub
		System.out.println("SuperRobot 입니다. 외형은 팔 다리 몸통 머리 가 있습니다.");
	}
	

}
