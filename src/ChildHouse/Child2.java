package ChildHouse;

public class Child2 extends LaunchMenu{

	public Child2(int rice, int bulgogi, int banana, int milk, int amond) {
		super(rice, bulgogi, banana, milk, amond);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calculate() {
		// TODO Auto-generated method stub
		return rice + bulgogi + banana + amond + milk;
	}

}
