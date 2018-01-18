package InterfaceEx;

public class MainClass {
	public static void main(String[] args) {
		InterfaceClass interfaceClass = new InterfaceClass();
		interfaceClass.getStr();
		interfaceClass.calculate();
		
		
		//타입의 선언에 따라 접근 제한이 가능하다.
		InterfaceEx ife = new InterfaceClass();
		InterfaceEx2 ife2 = new InterfaceClass();
		
		ife.calculate();
		ife2.getStr();
		
	}
}
