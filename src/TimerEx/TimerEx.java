package TimerEx;

import java.util.Timer;
import java.util.TimerTask;

public class TimerEx {

	public TimerEx() throws InterruptedException{
		super();
		// TODO Auto-generated constructor stub
		
		System.out.println("^^");
		
		Timer timer = new Timer(true);
		TimerTask t1 = new TimerTaskEx();
		TimerTask t2 = new TImerTaskEx2();
		
		timer.schedule(t1, 2000);
		timer.schedule(t2, 10000);
		
		
		Thread.sleep(11000);
		System.out.println("**");
	}
	
}
