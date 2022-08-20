package thisIsJAVA.Practice.chapter13.genericboxex.genericRec;

public class GenericMethod {
	
	public static <T, V> double genericMethod(Pointer<T,V> p1, Pointer<T,V> p2)  {
		double left = ((Number)p1.getX()).doubleValue();
		double right = ((Number)p2.getX()).doubleValue();
		double top = ((Number)p1.getY()).doubleValue();
		double bottom = ((Number)p2.getY()).doubleValue();
		
		double width = right - left;
		double height = top - bottom;
		
		
		return width * height;
	}
	
	public static void main(String[] args) {
		Pointer<Integer, Double> p1 = new Pointer<Integer, Double>(10, 0.0);
		Pointer<Integer, Double> p2 = new Pointer<Integer, Double>(0, 10.0);
		
		double size = GenericMethod.<Integer, Double>genericMethod(p1, p2);
		
	}
}
