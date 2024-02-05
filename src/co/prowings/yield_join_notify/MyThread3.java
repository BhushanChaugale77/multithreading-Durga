package co.prowings.yield_join_notify;

public class MyThread3 extends Thread {
		
		static Thread mt;
		
		public void run() {
		
	  try
		{
		  mt.join();
		}
 		
		catch (InterruptedException e) {	 
			}
	  	for(int i=0; i<7; i++) {
	  		
	  		System.out.println("child thread"); 
		}
	}
	 
	
	}


