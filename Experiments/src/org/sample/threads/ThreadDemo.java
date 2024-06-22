package org.sample.threads;

public class ThreadDemo extends Thread{
	
	public void run() {
		
		for (int i = 0; i < 8; i++) {
		
			System.out.println("I am running with Child Thread");
		/* try {
			 
			 System.out.println("Thread is running now :: " + Thread.currentThread().getId());
			 
		 }
		 catch(Exception e) {
			 
			 System.out.println("Exception happened");
		 }*/
	}
	}
}
