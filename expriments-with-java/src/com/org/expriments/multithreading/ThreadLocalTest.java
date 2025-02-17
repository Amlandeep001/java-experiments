package com.org.expriments.multithreading;

public class ThreadLocalTest
{
	public static void main(String[] args) throws InterruptedException
	{
		ThreadLocal<String> threadLocal = new ThreadLocal<>();
		threadLocal.set("Hello");
		System.out.println(threadLocal.get());

		Thread t = new Thread(() ->
		{
			System.out.println(threadLocal.get());
			threadLocal.set("World");
			System.out.println(threadLocal.get());
		});
		t.start();
		t.join(); // to ensure execution order is fine and main thread waits for the new thread to execute

		System.out.println(threadLocal.get());

		ThreadLocal<Integer> threadLocal1 = new ThreadLocal<>();
		threadLocal1.set(1);
		System.out.println(threadLocal1.get());
		threadLocal1.remove();
		System.out.println(threadLocal1.get());

		ThreadLocal<Integer> threadLocal2 = ThreadLocal.withInitial(() -> 1);
		System.out.println(threadLocal2.get());
		threadLocal2.remove();
		System.out.println(threadLocal2.get());
	}

}
