package com.prowings.multithreading_durga;

public class TestMyThread4 {

	 public static void main(String[] args) {
			
		 System.out.println(Thread.currentThread().getName());
		 
		 MyThreadDemo4 t4 = new MyThreadDemo4();
		 
		 System.out.println( t4.getName());
		  
		  Thread.currentThread().setName("Bhushan77");
		  
		  System.out.println(Thread.currentThread().getName());
	 }
}
