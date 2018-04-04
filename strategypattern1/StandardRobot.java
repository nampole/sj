package com.tinedge.sj.strategypattern1;

import com.tinedge.sj.strategypattern2.FireOk;
import com.tinedge.sj.strategypattern2.FlyNo;
import com.tinedge.sj.strategypattern2.FlyOk;
import com.tinedge.sj.strategypattern2.KnifeWithLazer;
import com.tinedge.sj.strategypattern2.KnifeWithWood;

public class StandardRobot extends Robot {

	public StandardRobot() {
		// TODO Auto-generated constructor stub
		flyAction = new FlyNo();
		fireAction = new FireOk();
		knifeAction = new KnifeWithWood();
	}
	
	@Override
	public void shape() {
		// TODO Auto-generated method stub
		System.out.println("StandardRobot 입니다. 외형은 팔 다리 몸통 머리 가 있습니다.");
	}
	

}
