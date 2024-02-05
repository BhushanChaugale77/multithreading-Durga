package com.prowings.synchoronised.block;

public class SynchronisedBlockDemo {

	public static void main(String[] args) {
		
		Display d = new Display();
		
		MyThread t1 = new MyThread(d, "Dhoni");
		MyThread t2 = new MyThread(d, "Youraj");
		
		t1.start();
		t2.start();
		
		
	}
	
}
