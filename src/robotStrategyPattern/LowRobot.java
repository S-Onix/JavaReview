package robotStrategyPattern;

public class LowRobot extends Robot{
	
	
	public LowRobot() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionFly() {
		// TODO Auto-generated method stub
		System.out.println("can fly");
	}
	@Override
	public void actionMissile() {
		// TODO Auto-generated method stub
		System.out.println("can shot missile");
	}
	@Override
	public void acitonKnife() {
		// TODO Auto-generated method stub
		System.out.println("no have knife");
	}
	

}
