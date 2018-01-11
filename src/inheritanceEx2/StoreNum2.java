package inheritanceEx2;

public class StoreNum2 extends HeadQuarterStore{
	
	@Override
	public void orderMethod2() {
		System.out.println("2부대찌개  : 5000");
	}
	@Override
	public void orderMethod3() {
		System.out.println("2비빔밥  : 5000");
	}
	@Override
	public void orderMethod4() {
		System.out.println("2순대국  : 4000");
	}
	@Override
	public void orderMethod5() {
		super.orderMethod5();
		System.out.println("2공기밥  : 무료");
	}
	
}