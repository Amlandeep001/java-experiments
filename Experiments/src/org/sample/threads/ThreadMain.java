package org.sample.threads;

public class ThreadMain
{
	public static void main(String... a)
	{
		ThreadDemo td = new ThreadDemo();
		td.isDaemon();
		td.start();

		for(int i = 0; i < 8; i++)
		{
			System.out.println("I am running with Main Thread");
		}
	}
}
