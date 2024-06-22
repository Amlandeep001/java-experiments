package org.sample;

public class ThreadExample
{
	public static void main(String args[])
	{
		Printer printer1 = new Printer(1);
		Printer printer2 = new Printer(0);
		Thread t1 = new Thread(printer1, "First Thread");
		Thread t2 = new Thread(printer2, "Second Thread");
		t1.start();
		t2.start();
	}
}

class Printer implements Runnable
{
	final static Object lock = new Object();
	static int start = 1;
	int rem;

	public Printer(int rem)
	{
		this.rem = rem;
	}

	@Override
	public void run()
	{
		while (start <= 20)
		{
			synchronized(lock)
			{
				if(start % 2 == rem)
				{
					System.out.println("The value is : " + start + " by the thread " + Thread.currentThread().getName());
					start++;
					lock.notifyAll();
				}
				else
				{
					try
					{
						lock.wait();
					}
					catch(InterruptedException e)
					{
						throw new RuntimeException(e);
					}
				}
			}
		}
	}
}
