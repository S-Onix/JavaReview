
public class classEx {
	public classEx() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		classEx2 c = new classEx2(15,160,50,"010-1111-1111");
		
		c.getAge();
		c.setAge(15);
		
		double d = c.calculateBMI();
		System.out.println(d);
	}
}
