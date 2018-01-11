package inheritanceEx2;

public class MainClass {
	public static void main(String[] args) {
		
		HeadQuarterStore num1 = new StoreNum1();
		HeadQuarterStore num2 = new StoreNum2();
		HeadQuarterStore num3 = new StoreNum3();
		
		num1.orderMethod1();
		num2.orderMethod1();
		num3.orderMethod1();
		
	}
}
