package com.org.expriments.createThreads;

public class MultiThreadDemo extends Thread
{
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
