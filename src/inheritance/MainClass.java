package inheritance;

public class MainClass {
	public static void main(String [] args) {
		Child child = new Child();
		
		System.out.println(child.getMamiName() + " " + child.getPapaName() + " " + child.cStr);
	}
}
