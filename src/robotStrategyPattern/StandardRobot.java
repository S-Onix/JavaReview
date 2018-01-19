package robotStrategyPattern;

public class StandardRobot extends Robot{

	public StandardRobot() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionFly() {
		// TODO Auto-generated method stub
		System.out.println("can not fly");
	}

	@Override
	public void actionMissile() {
		// TODO Auto-generated method stub
		System.out.println("can shot missile");
	}
	
	@Override
	public void acitonKnife() {
		// TODO Auto-generated method stub
		System.out.println("have wood knife");
	}
}

