package com.org.expriments.threads;

/**
 * 1. Lightweight Threads
Virtual Threads are much lighter than traditional threads, enabling you to handle thousands or even millions of concurrent tasks without running into memory or performance issues.

 2. Simplified Concurrency
Forget about complex thread pool management. Virtual Threads make it easier to write and maintain concurrent code.

 3. Improved Scalability
Virtual Threads are designed for scalable applications, making them perfect for building high-performance web servers or handling large-scale asynchronous tasks.

 4. Reduced Context Switching
Virtual Threads minimize the cost of context switching, which improves overall application performance.

 5. Better Resource Utilization
Virtual Threads reduce the memory overhead of traditional threads, allowing you to make better use of system resources.

* The below simple snippet demonstrates how you can run thousands of tasks concurrently with minimal resource usage.
 */

/*public class SampleVirtualThreads
{
	public static void main(String[] args)
	{
		try(var executor = Executors.newVirtualThreadPerTaskExecutor())
		{
			for(int i = 0; i < 1000; i++)
			{
				executor.submit(() -> System.out.println("Running task " + Thread.currentThread().getName()));
			}
		}
	}
}*/

// With Thread Factory:

public class SampleVirtualThreads
{
	public static void main(String[] args) throws InterruptedException
	{
		/*try(var executor = Executors.newThreadPerTaskExecutor(
				Thread.ofVirtual().name("virtual-thread-", 0).factory()))
		{
			for(int i = 0; i < 10; i++)
			{
				final int taskNumber = i;
				executor.submit(() ->
				{
					System.out.println("Running task " + taskNumber + " on " + Thread.currentThread().getName());
				});
			}
		}*/

		Runnable task = () -> System.out.println("Running on: " + Thread.currentThread());

		Thread thread = Thread.ofVirtual().start(task);
		thread.join(); // Wait for the virtual thread to finish
	}
}
