package com.prowings.multithreading_durga;

public class MyRunnable implements Runnable {

	 
	public void run() {
	
		for(int i=0; i<7; i++) {
			
			System.out.println("child Thread");
		}
	}
	
	
	

}
