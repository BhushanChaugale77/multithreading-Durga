package com.prowings.synchoronised.block;

public class Display {
	
	public void wish(String name) {
		
		// ;;;; 1 lakh lines of code
		
		synchronized (this) {
		
			for(int i=0; i<=10; i++) {
				
				System.out.println("good morning");
				try
				{
					Thread.sleep(2000);
				}
				catch (InterruptedException e) {}
				
				System.out.println(name);
			}
	
		}
		
	}
}


