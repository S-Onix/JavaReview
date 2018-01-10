package children;

import papa.PapPouch;

public class SecondChild {
	public void takeMoney(int money) {
		PapPouch.MONEY = PapPouch.MONEY - money;
		if(PapPouch.MONEY < 0) System.out.println("아빠 지갑에 돈이 없어요.");
	}
}
