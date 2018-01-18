package toyEx;

public class MainClass {
	public static void main(String[] args) {
		IToy b = new BearToy();
		IToy m = new MazingaToy();
		IToy a = new AirplainToy();
		
		IToy[] toys = {b,m,a};
		
	}
}
