package co.prowings.yield_join_notify;

public class ThredSleepDemo2 {

	public static void main(String[] args) {
		MyThread5 t = new MyThread5();
		t.start();
		t.interrupt();
		System.out.println("end of main thread");
		
	}
	
	
}
