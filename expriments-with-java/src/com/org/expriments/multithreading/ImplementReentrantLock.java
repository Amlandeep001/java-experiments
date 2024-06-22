package com.org.expriments.multithreading;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Amlan
 * @implNote: A reentrant lock is a mutual exclusion mechanism that allows threads to reenter 
 * into a lock on a resource (multiple times) without a deadlock situation. A thread entering 
 * into the lock increases the hold count by one every time. Similarly, the hold count decreases 
 * when unlock is requested. Therefore, a resource is locked until the counter returns to zero.
 */

public class ImplementReentrantLock
{
	ReentrantLock lock = new ReentrantLock();
	int counter = 0;

	public void perform()
	{
		lock.lock();
		System.out.println(lock.getHoldCount()); // increasing the hold count by 1
		try
		{
			// Critical section here
			counter++;
		}
		finally
		{
			lock.unlock();
			System.out.println(lock.getHoldCount()); // decreasing the hold count by 1
		}
	}
	// ...

	public static void main(String[] args)
	{
		ImplementReentrantLock rl = new ImplementReentrantLock();
		rl.perform();
	}
}
