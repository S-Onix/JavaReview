package robotStrategyPattern;

import robotStrategyPatternInterface.IFly;
import robotStrategyPatternInterface.IKnife;
import robotStrategyPatternInterface.IMissile;

public abstract class Robot {

	IFly fly;
	IMissile missile;
	IKnife knife;
	
	public Robot() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void actionWalk() {
		// TODO Auto-generated method stub
		System.out.println("cam walk");
	}
	
	public void actionRun() {
		// TODO Auto-generated method stub
		System.out.println("can run");
	}
	
	public abstract void shape();
	
	public void setFly(IFly fly) {
		this.fly = fly;
	}

	public void setMissile(IMissile missile) {
		this.missile = missile;
	}

	public void setKnife(IKnife knife) {
		this.knife = knife;
	}
	
	public void actionKnife() {
		// TODO Auto-generated method stub
		this.knife.knife();
	}
	
	public void actionMissile() {
		// TODO Auto-generated method stub
		this.missile.missile();

	}
	
	public void actionFly() {
		// TODO Auto-generated method stub
		this.fly.fly();
	}
}
