package co.prowings.yield_join_notify;

public class MyThread extends Thread {
	
	public void run() {
 
		for(int i=0; i<7; i++)
		{
			System.out.println("child thread");
		 	Thread.yield();
		}
	
	}

}
