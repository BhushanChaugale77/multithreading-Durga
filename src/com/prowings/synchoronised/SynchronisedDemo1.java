package com.prowings.synchoronised;

public class SynchronisedDemo1 {
	
	public static void main(String[] args) {
		
		Display2 d = new Display2();
		MyThread2 t = new MyThread2(d);
		MyThread2a t1 = new MyThread2a(d);
		t.start();
		t1.start();
		
	}

}
