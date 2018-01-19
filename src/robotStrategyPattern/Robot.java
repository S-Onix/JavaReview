package robotStrategyPattern;

public abstract class Robot {

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
	
	public void shape() {
		// TODO Auto-generated method stub
		System.out.println("SuperRobot : arm, leg, body, head");
	}
	
	public abstract void actionFly();
	public abstract void actionMissile();
	public abstract void acitonKnife();
}
