package ThreadTest;

public class Test1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println(Thread.currentThread().getName());
		
		System.out.println("Thread1 start");
		
		for (int i = 0; i < 10; i++) {
			System.out.println("i = " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(Thread.currentThread().getName() + " 종료");
	}

}
