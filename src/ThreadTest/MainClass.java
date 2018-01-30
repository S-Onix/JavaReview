package ThreadTest;

public class MainClass {
	public static void main(String[] args) {
		Test1 test = new Test1();
		Test2 t2 = new Test2();
		t2.setName("B");
		Thread t1 = new Thread(test, "A");
		t2.start();
		t1.start();
		
		System.out.println(Thread.currentThread().getName());
	}
}
