package ChildHouse;

public abstract class LaunchMenu {
	public int rice;
	public int bulgogi;
	
	public int banana;
	public int milk;
	public int amond;
	
	public LaunchMenu(int rice, int bulgogi, int banana, int milk, int amond) {
		this.rice = rice;
		this.bulgogi = bulgogi;
		this.banana = banana;
		this.milk = milk;
		this.amond = amond;
	}
	
	public abstract int calculate();
}
