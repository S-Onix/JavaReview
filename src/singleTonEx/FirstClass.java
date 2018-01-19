package singleTonEx;

public class FirstClass {

	public FirstClass() {
		super();
		// TODO Auto-generated constructor stub
		
		SingleTonClass singleTonClass = SingleTonClass.getSingleTonClass();
		System.out.println("First Class");
		System.out.println("i = " + singleTonClass.getI());
		singleTonClass.setI(200);
		System.out.println("i = " + singleTonClass.getI());
		
	}
	
}
