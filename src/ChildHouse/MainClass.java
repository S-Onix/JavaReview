package ChildHouse;

public class MainClass {
	public static void main(String[] args) {
		
		//객체들이 많을 경우 실수를 줄이기 위해 PriceTable 클래스를 만들어준다. (누구나 동일한 값 사용 가능)
		LaunchMenu child1 = new Child1(PriceTable.RICE, PriceTable.BUGOGI, PriceTable.BANANA, PriceTable.MILK, PriceTable.AMOND);
		LaunchMenu child2 = new Child2(PriceTable.RICE, PriceTable.BUGOGI, PriceTable.BANANA, PriceTable.MILK, PriceTable.AMOND);
		
		System.out.println("chil1 의  식대 : "  + child1.calculate());
		System.out.println("chil2 의  식대 : "  + child2.calculate());
	}
}
