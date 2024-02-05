package co.prowings.yield_join_notify;

public class ThreadJoinDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		MyThread2 t = new MyThread2();
		
		t.start();
		
	 	t.join();
		for(int i=0; i<7; i++)
		{
			System.out.println("Rama Thread");
		}
		
	}
	

}
