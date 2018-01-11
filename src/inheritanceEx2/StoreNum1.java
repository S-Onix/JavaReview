package inheritanceEx2;

public class StoreNum1 extends HeadQuarterStore{
	@Override
	public void orderMethod1() {
		System.out.println("1김치찌개  : 4500");
	}
	@Override
	public void orderMethod2() {
		System.out.println("1부대찌개  : 5000");
	}

	@Override
	public void orderMethod4() {
		System.out.println("1순대국  : 판매x");
	}
	
}