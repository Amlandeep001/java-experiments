package org.sample.threads;

//Java code for thread creation by extending
//the Thread class
/*class MultithreadingDemo extends Thread {
 public void run()
 {
     try {
         // Displaying the thread that is running
         System.out.println(
             "Thread " + Thread.currentThread().getId()
             + " is running");
     }
     catch (Exception e) {
         // Throwing an exception
         System.out.println("Exception is caught");
     }
 }
}*/

class MultithreadingDemo implements Runnable
{
	public void run()
	{
		try
		{
			// Displaying the thread that is running
			System.out.println(
					"Thread " + Thread.currentThread().threadId()
							+ " is running");
		}
		catch(Exception e)
		{
			// Throwing an exception
			System.out.println("Exception is caught");
		}
	}
}