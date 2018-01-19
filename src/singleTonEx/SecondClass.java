package singleTonEx;

public class SecondClass {

	public SecondClass() {
		super();
		// TODO Auto-generated constructor stub
		
		//static method 호출했기에 '이탤릭체' 로 작성된다.
		SingleTonClass singleTonClass = SingleTonClass.getSingleTonClass();
		System.out.println("Second Class");
		System.out.println("i = " + singleTonClass.getI());
	}

}
