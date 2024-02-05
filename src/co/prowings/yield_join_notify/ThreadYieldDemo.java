package co.prowings.yield_join_notify;

public class ThreadYieldDemo {
	
	public static void main(String[] args) {
		
		MyThread t = new MyThread();
		
		t.start();
		
		for(int i=0; i<7; i++) {
			System.out.println("main Thread");
		}
		
		
		
	}

}
