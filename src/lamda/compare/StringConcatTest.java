package lamda.compare;

public class StringConcatTest {
	public static void main(String[] args) {
		StringConcat strImpl = new StringConcatImpl();
		strImpl.makeString("Hello", "World");
		
		StringConcatFunctionalInterface str = (str1, str2) -> System.out.println(str1 + ", " + str2);
		str.makeString("Hello", "World");
		
		
	}
}
