package com.prowings.multithreading_durga;

public class TestThreadPriority2 {

	public static void main(String[] args) {
		
		 MyThreadTestPriority2 t = new MyThreadTestPriority2();
		 t.setPriority(10);
		 t.start();
		 
		 for (int i=0; i<7; i++) {
			 System.out.println("main thread");
		 }
	}
	
}
