package com.org.expriments.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

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
		latch.await(5, TimeUnit.SECONDS); // will wait for other 3 tasks to get finished
		System.out.println("Main");
		executorService.shutdown(); // call shutdownNow() to stop the above 3 worker threads once main thread completes its execution
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
			Thread.sleep(6000);
			System.out.println(Thread.currentThread().getName() + " service started.");
		}
		finally
		{
			latch.countDown();
		}
		return "ok";
	}
}
