package com.org.expriments.deadlock;

/**
 * @author Amlan
 * 
 * Here, thread 1 locks the resource 1 and then tries to lock resource 2 and
 * thread 2 locks the resource 2 and then tries locking the resource 1.
 * Hence, it's kind of circular wait condition appears resulting the Deadlock.
 * 
 * Resolution: A simple way to avoid deadlocks is to ensure that both threads 
 * acquire resources in the same order (e.g., always lock resource1 first, then resource2).
 */
public class DeadlockSimulation
{
	public static void main(String[] args)
	{
		final Object resource1 = new Object();
		final Object resource2 = new Object();

		Thread thread1 = new Thread(() ->
		{
			synchronized(resource1)
			{
				System.out.println("Thread 1: Holding resource 1...");
				try
				{
					Thread.sleep(100);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				System.out.println("Thread 1: Waiting for resource 2...");

				synchronized(resource2)
				{
					System.out.println("Thread 1: Holding resource 1 and resource 2...");
				}
			}
		});

		Thread thread2 = new Thread(() ->
		{
			synchronized(resource2) // Deadlock prevention: resource1 locking instead of resource 2
			{
				System.out.println("Thread 2: Holding resource 2...");
				try
				{
					Thread.sleep(100);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				System.out.println("Thread 2: Waiting for resource 1...");

				synchronized(resource1) // Deadlock prevention: resource2 locking instead of resource 1
				{
					System.out.println("Thread 2: Holding resource 1 and resource 2...");
				}
			}
		});

		thread1.start();
		thread2.start();
	}
}
