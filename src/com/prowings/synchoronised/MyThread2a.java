package com.prowings.synchoronised;

import java.security.PublicKey;

public class MyThread2a  extends Thread{
   Display2 d;
   
   public MyThread2a(Display2 d) {
	   
	   this.d = d;
    }
	   
 	public void run() {
 		
 		 d.display();
 	}
 }
   
	
	 
