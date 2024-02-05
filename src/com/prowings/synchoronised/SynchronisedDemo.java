package com.prowings.synchoronised;

public class SynchronisedDemo {

	public static void main(String[] args) {
		Display d = new Display();
		Display d1 = new Display();
		MyThread t = new MyThread(d, "Dhoni");
		MyThread t1 = new MyThread(d1, "Youraj");
		t.start();
		t1.start();
		
	}
}
