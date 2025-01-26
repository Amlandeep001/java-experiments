package com.org.expriments.threads;

/**
 * @author Amlan
 * @implNote: creation of threads via extending the Thread class
 */
public class MultiThreadDemo extends Thread
{
	@Override
	public void run()
	{
		try
		{
			System.out.println("Current Thread: " + Thread.currentThread().threadId() + " is running");
		}
		catch(Exception e)
		{
			System.out.println("Exception occured");
		}
	}
}
