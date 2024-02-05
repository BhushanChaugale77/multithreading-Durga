package com.prowings.synchoronised;

public class Display2a {
	
	public synchronized void display() {
		 
		for(int i=65; i<75; i++) { 
			System.out.println((char)i);
			 
			try {
				Thread.sleep(2000);
			}
			catch (InterruptedException e) { }
 		}
		
	}

}
