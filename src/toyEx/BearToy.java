package toyEx;

public class BearToy implements MovingArmLeg{

	
	
	public BearToy() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("곰인형입니다");
		canMoveArm();
		canMoveLeg();
	}

	@Override
	public void canMoveArm() {
		// TODO Auto-generated method stub
		System.out.println("Moving Arm");
	}

	@Override
	public void canMoveLeg() {
		// TODO Auto-generated method stub
		System.out.println("Moving Leg");
	}

}
