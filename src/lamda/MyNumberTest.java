package lamda;

public interface MyNumberTest {
	public static void main(String[] args) {
		MyNumber myNumber = (x, y) -> x>=y? x : y;
		System.out.println(myNumber.getMax(10, 20));
	}
}
