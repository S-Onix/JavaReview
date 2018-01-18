package toyEx;

public class MazingaToy implements Missile, MovingArmLeg{

	
	
	public MazingaToy() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("마징가 입니다");
		canMoveArm();
		canMoveLeg();
		canMissile();
	}

	@Override
	public void canMoveArm() {
		// TODO Auto-generated method stub
		System.out.println("Moving Arm shotshot");
		
	}

	@Override
	public void canMoveLeg() {
		// TODO Auto-generated method stub
		System.out.println("Moving Leg gogo");
	}

	@Override
	public void canMissile() {
		// TODO Auto-generated method stub
		System.out.println("Fire!!!");
	}

}
