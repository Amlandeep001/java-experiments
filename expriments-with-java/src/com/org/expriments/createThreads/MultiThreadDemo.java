package com.org.expriments.createThreads;

/**
 * @implNote: creation of threads via extending the Thread class
 * @author Amlan
 */
public class MultiThreadDemo extends Thread
{
	@Override
	public void run()
	{
		try
		{
			System.out.println("Current Thread: " + Thread.currentThread().getId() + " is running");
		}
		catch(Exception e)
		{
			System.out.println("Exception occured");
		}
	}
}
