package robotStrategyPattern;

import robotStrategyPatternInterface.FlyNo;
import robotStrategyPatternInterface.KnifeNo;
import robotStrategyPatternInterface.MissileNo;

public class MainClass {
	public static void main(String[] args) {
		Robot superRobot = new SuperRobot();
		Robot LowRobot = new LowRobot();
		
		LowRobot.shape();
		LowRobot.setFly(new FlyNo());
		LowRobot.setMissile(new MissileNo());
		LowRobot.setKnife(new KnifeNo());
		LowRobot.actionFly();
		LowRobot.actionKnife();
		LowRobot.actionMissile();
		
		
		superRobot.shape();
		superRobot.actionFly();
		superRobot.actionKnife();
		superRobot.actionMissile();
		
	}
}
