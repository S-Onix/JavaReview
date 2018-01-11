package inheritanceEx2;

public class StoreNum3 extends HeadQuarterStore{
	@Override
	public void orderMethod1() {
		System.out.println("3김치찌개  : 6000");
	}
	@Override
	public void orderMethod2() {
		System.out.println("3부대찌개  : 7000");
	}
	@Override
	public void orderMethod3() {
		System.out.println("3비빔밥  : 7000");
	}
	@Override
	public void orderMethod4() {
		System.out.println("3순대국  : 6000");
	}
	
}
