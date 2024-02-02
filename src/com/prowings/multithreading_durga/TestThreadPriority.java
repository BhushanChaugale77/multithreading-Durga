package com.prowings.multithreading_durga;

public class TestThreadPriority {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getPriority());
		
//		Thread.currentThread().setPriority(15);   //  java.lang.IllegalArgumentException
		
		MyThreadTestPriority t = new MyThreadTestPriority();
//		t.setPriority(7);
		System.out.println(t.getPriority());
	}
	
}
