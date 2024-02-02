package com.prowings.multithreading_durga;

public class TestMyThread1 {

	public static void main(String[] args) {
		
		MyThreadDemo1 t = new MyThreadDemo1();
		
		t.start();
		
		for(int i=0; i < 7; i++)
		{
			System.out.println("main Thread");
		}
	}
}
