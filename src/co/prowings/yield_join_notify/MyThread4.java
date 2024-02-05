package co.prowings.yield_join_notify;

public class MyThread4 extends Thread {
		
	 
		
		public void run() {
		
	  try {
		  
	   for(int i=0; i<7; i++) {
		 {
		   System.out.println("I am lazy Thread");
		   Thread.sleep(2000);
		 }
	   }
	  }catch (InterruptedException e) {
	 	 
		   System.out.println("I got Interuppeted"); 
	}
		}
	 
	
	}


