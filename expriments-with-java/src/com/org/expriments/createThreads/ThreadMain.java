package com.org.expriments.createThreads;

public class ThreadMain
{
	public static void main(String[] args)
	{
		for(int i = 0; i < 8; i++)
		{
			MultiThreadDemo t = new MultiThreadDemo();
			t.start(); // start() will create a thread and run that but run() will directly run the main thread without creating anything new
		}
	}
}
