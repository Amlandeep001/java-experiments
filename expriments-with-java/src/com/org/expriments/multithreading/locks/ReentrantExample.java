package com.org.expriments.multithreading.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @implNote Here we are using ReentrantLock to demonstrate reentrant nature of locks.
 * Even if the outer method is already having the lock, inner method can acquire the lock again.
 */
public class ReentrantExample
{
	private final Lock lock = new ReentrantLock();

	public void outerMethod()
	{
		lock.lock();
		try
		{
			System.out.println("Outer method");
			innerMethod();
		}
		finally
		{
			lock.unlock();
		}
	}

	public void innerMethod()
	{
		lock.lock();
		try
		{
			System.out.println("Inner method");
		}
		finally
		{
			lock.unlock();
		}
	}

	public static void main(String[] args)
	{
		ReentrantExample example = new ReentrantExample();
		example.outerMethod();
	}
}
