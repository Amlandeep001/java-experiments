package com.org.expriments.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestCountDownLatch
{
	public static void main(String[] args) throws InterruptedException
	{
		final int n = 3;
		final ExecutorService executorService = Executors.newFixedThreadPool(n);
		final CountDownLatch latch = new CountDownLatch(n);
		executorService.submit(new DependentService(latch));
		executorService.submit(new DependentService(latch));
		executorService.submit(new DependentService(latch));
		latch.await(); // main has to wait for other 3 tasks to get finished
		System.out.println("Main");
		executorService.shutdown(); // call shutdownNow() to stop the above 3 worker threads(before execution) once main thread completes its execution
	}
}

class DependentService implements Callable<String>
{
	private final CountDownLatch latch;

	public DependentService(CountDownLatch latch)
	{
		this.latch = latch;
	}

	@Override
	public String call() throws Exception
	{
		try
		{
			System.out.println(Thread.currentThread().getName() + " service started.");
			Thread.sleep(2000);
		}
		finally
		{
			latch.countDown();
		}
		return "ok";
	}
}
