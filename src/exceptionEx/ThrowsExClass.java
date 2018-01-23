package exceptionEx;

public class ThrowsExClass {

	public ThrowsExClass() {
		super();
		// TODO Auto-generated constructor stub
		actionC();
	}
	
	private void actionA() throws Exception{
		int[] array = {1,2,3,4};
		System.out.println(array[4]);
		System.out.println("action A");
	}
	
	private void actionB() {
		System.out.println("action B");
		
		try {
			actionA();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception");
			System.out.println(e.getMessage());
		}
		
	}
	
	private void actionC() {
		System.out.println("action C");
		actionB();
		System.out.println("action C");
	}
	
}
