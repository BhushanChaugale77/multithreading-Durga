package com.prowings.synchoronised;

public class Display2 {
	
 

	public synchronized void display() {
		 
		for(int i=1; i<10; i++) { 
			System.out.println(i);
			 
			try {
				Thread.sleep(2000);
			}
			catch (InterruptedException e) { }
 		}
		
	}

}
