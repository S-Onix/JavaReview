package ChildHouse;

public class Child1 extends LaunchMenu{

	
	
	public Child1(int rice, int bulgogi, int banana, int milk, int amond) {
		super(rice, bulgogi, banana, milk, amond);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calculate() {
		// TODO Auto-generated method stub
		return rice + bulgogi + amond;
	}
	
	
}
