package toyEx;

public class AirplainToy implements Missile, Light{

	public AirplainToy() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("비행기 입니다");
		canLight();
		canMissile();
	}

	@Override
	public void canLight() {
		// TODO Auto-generated method stub
		System.out.println("Lighting!");
	}

	@Override
	public void canMissile() {
		// TODO Auto-generated method stub
		System.out.println("Fire to the target!");
	}

}
