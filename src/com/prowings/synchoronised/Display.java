package com.prowings.synchoronised;

public class Display {
	
 

	public synchronized void wish(String name) {
		
		for(int i=0; i<7; i++)
		{
			System.out.println("good mornig");
			try {
				Thread.sleep(2000);
			}
			catch (InterruptedException e) {
			}
			System.out.println(name);
		}
		
	}

}
