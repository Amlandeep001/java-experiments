package com.org.expriments.multithreading;

/**
 * @author Amlan
 * @implNote: The TheadLocal construct allows us to store data that will be accessible
 * only by a specific thread. As memory is shared among different threads, 
 * ThreadLocal allows a way to store and retrieve values for each thread separately.
 * It allows each thread to have its own independent copy of a variable. This is useful 
 * when you need to associate state with a thread, ensuring that data is isolated and preventing concurrency issues.
 */
public class ImplementThreadLocal
{
	/*public static void main(String[] args)
	{
		ThreadLocal<Integer> threadLocalValue = new ThreadLocal<>();
		
		threadLocalValue.set(1);
		Integer result = threadLocalValue.get();
		
		System.out.println(result);
		
		// We can construct an instance of the ThreadLocal by using the withInitial() static method and passing a supplier to it:
		
		ThreadLocal<Integer> threadLocal = ThreadLocal.withInitial(() -> 1);
		
		System.out.println(threadLocal.get());
		
		// To remove the value from the ThreadLocal, we can call the remove() method:
		
		threadLocal.remove();
		
		
	}*/

	private static ThreadLocal<String> threadName = ThreadLocal.withInitial(() -> "Default Thread");

	public static void main(String[] args)
	{
		Thread thread1 = new Thread(() ->
		{
			threadName.set("Thread-1");
			System.out.println(Thread.currentThread().getName() + ": " + threadName.get());
		}, "Thread-1");

		Thread thread2 = new Thread(() ->
		{
			threadName.set("Thread-2");
			System.out.println(Thread.currentThread().getName() + ": " + threadName.get());
		}, "Thread-2");

		thread1.start();
		thread2.start();

		System.out.println(Thread.currentThread().getName() + ": " + threadName.get());

		// Each thread accesses and modifies its own copy of the threadName variable, without affecting other threads.
	}
}
