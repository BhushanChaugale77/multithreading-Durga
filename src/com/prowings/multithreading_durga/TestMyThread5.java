package com.prowings.multithreading_durga;

public class TestMyThread5 {

	 public static void main(String[] args) {
			
 		 
		 MyThreadDemo5 t5 = new MyThreadDemo5();
		 t5.start();	
		 t5.setName("Bhushan77");
		 System.out.println("The executing Thread name is: "+Thread.currentThread().getName());
		 
	 }
}
