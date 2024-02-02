package com.prowings.multithreading_durga;

public class TestMyThread3 {

	public static void main(String[] args) {
		
		MyThreadDemo3 t = new MyThreadDemo3();
		
		t.start();
		System.out.println("start by main method like a normal method call");
				 
	}
}
