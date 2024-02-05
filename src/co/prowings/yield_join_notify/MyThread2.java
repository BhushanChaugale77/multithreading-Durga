package co.prowings.yield_join_notify;

public class MyThread2 extends Thread {
	
	public void run() {
 
		for(int i=0; i<7; i++)
		{
			System.out.println("seeta thread");
			
			try
			{
				Thread.sleep(100);
			}
			catch (InterruptedException e) {
				System.out.println("...");
			}
			 
		}
	
	}

}
