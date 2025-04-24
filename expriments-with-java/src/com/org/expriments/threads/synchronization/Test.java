package com.org.expriments.threads.synchronization;

/**
 * YouTube: https://www.youtube.com/watch?v=ge6_41ZRr_w&list=PLA3GkZPtsafYhmrZR_1nmQqfFSnkftOud&index=8
 */
public class Test
{
	public static void main(String[] args)
	{
		Counter counter = new Counter();
		MyThread t1 = new MyThread(counter);
		MyThread t2 = new MyThread(counter);
		t1.start();
		t2.start();

		try
		{
			t1.join();
			t2.join();
		}
		catch(InterruptedException e)
		{
			throw new RuntimeException(e);
		}

		System.out.println(counter.getCount());
	}
}
