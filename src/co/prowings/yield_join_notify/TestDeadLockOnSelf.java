package co.prowings.yield_join_notify;

public class TestDeadLockOnSelf {
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread.currentThread().join();
		
	}
	

}
