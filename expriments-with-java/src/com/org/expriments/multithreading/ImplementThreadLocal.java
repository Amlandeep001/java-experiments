package com.org.expriments.multithreading;

/**
 * @author Amlan
 * @implNote: The TheadLocal construct allows us to store data that will be accessible
 * only by a specific thread. As memory is shared among different threads, 
 * ThreadLocal allows a way to store and retrieve values for each thread separately.
 */
public class ImplementThreadLocal
{
	public static void main(String[] args)
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
	}
}
