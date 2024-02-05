package co.prowings.yield_join_notify;

public class ThredSleepDemo {

	public static void main(String[] args) {
		MyThread4 t = new MyThread4();
		t.start();
		t.interrupt();
		System.out.println("end of main");
		
	}
	
	
}
