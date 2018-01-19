package singleTonEx;

public class SecondClass {

	public SecondClass() {
		super();
		// TODO Auto-generated constructor stub
		
		SingleTonClass singleTonClass = SingleTonClass.getSingleTonClass();
		System.out.println("Second Class");
		System.out.println("i = " + singleTonClass.getI());
	}

}
