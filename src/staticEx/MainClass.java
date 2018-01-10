package staticEx;

import children.FirstChild;
import children.SecondChild;
import children.ThirdChild;
import papa.PapPouch;

public class MainClass {
	public static void main(String[] args) {
		FirstChild firstChild = new FirstChild();
		firstChild.takeMoney(100);
		
		SecondChild secondChild = new SecondChild();
		secondChild.takeMoney(100);
		
		ThirdChild thirdChild = new ThirdChild();
		thirdChild.takeMoney(100);
		
		System.out.println( "아빠의 지갑에는? : " +PapPouch.MONEY);
	}
}
