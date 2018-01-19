package robotStrategyPattern;

import robotStrategyPatternInterface.FlyYes;
import robotStrategyPatternInterface.KnifeLazer;
import robotStrategyPatternInterface.MissileYes;

public class SuperRobot extends Robot{

	
	public SuperRobot() {
		super();
		// TODO Auto-generated constructor stub
		fly = new FlyYes();
		missile = new MissileYes();
		knife = new KnifeLazer();
	}

	@Override
	public void shape() {
		// TODO Auto-generated method stub
		System.out.println("Super Robot : arm, leg, body, head");
		
	}
	
}
