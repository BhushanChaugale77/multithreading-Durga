package com.prowings.multithreading_durga;

public class TestRunnable {

	public static void main(String[] args) {
		
		MyRunnable r = new MyRunnable();
		
		Thread t = new Thread(r);
		
		t.start();
		for (int i=0; i<7; i++) {
			System.out.println("main thread");
		}
		
		
	}
}
