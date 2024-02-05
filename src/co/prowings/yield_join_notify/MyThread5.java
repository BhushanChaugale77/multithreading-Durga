package co.prowings.yield_join_notify;

public class MyThread5 extends Thread {
		
 	public void run() {
 		 int counter = 0;
 		for(int i=0; i<1000; i++)
 		{
 			System.out.println("i am lazy Thread");
 			 counter ++;
 			 System.out.println(+counter);
 		}
 		
 		System.out.println("I am entering into sleeping state");
 		
 		try {
 			Thread.sleep(100);
 		}catch(InterruptedException e) {
 			System.out.println("i got interrupted");
 		}
 	}


	 
	
	}


