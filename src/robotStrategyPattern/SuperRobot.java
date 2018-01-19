package robotStrategyPattern;

public class SuperRobot extends Robot{

	public SuperRobot() {
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
		System.out.println("have rasier knife");
	}
	
	
}
