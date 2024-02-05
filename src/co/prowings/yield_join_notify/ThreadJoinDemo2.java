package co.prowings.yield_join_notify;

public class ThreadJoinDemo2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		 MyThread3.mt = Thread.currentThread();
		 MyThread3 t= new MyThread3();
	  	 t.start();
		
	  	 for(int i=0; i<7; i++){
	  		 
			System.out.println("main thread");
			Thread.sleep(2000);
			 
		}
		
	}
	

}
