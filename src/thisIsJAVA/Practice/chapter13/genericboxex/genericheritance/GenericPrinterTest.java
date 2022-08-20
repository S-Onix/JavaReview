package thisIsJAVA.Practice.chapter13.genericboxex.genericheritance;

public class GenericPrinterTest {
	public static void main(String[] args) {
		GenericPrinter<Powder> powerPrinter = new GenericPrinter<>();
		
		GenericPrinter<Plastic> test = new GenericPrinter<>();
		//GenericPrinter<Water> test = new GenericPrinter<>(); Material을 상속받은 클래스가 아니기때문에 오류발생
	}
}
