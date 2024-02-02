package com.prowings.multithreading_durga;

public class MyThreadDemo3 extends Thread {

	public void start() {
	//	super.start();   //if we uncomment this run method will call
		System.out.println("inside start method ");
	}
	
	public void run()
	{
		System.out.println("inside run");
		
	}
 
	
}
