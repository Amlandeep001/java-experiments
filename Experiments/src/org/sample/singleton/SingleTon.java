package org.sample.singleton;

public class SingleTon
{

	private volatile static SingleTon singleTon;

	private SingleTon()
	{
	}

	public static SingleTon getInstance()
	{
		if(singleTon == null)
		{
			synchronized(SingleTon.class)
			{
				if(singleTon == null)
				{
					singleTon = new SingleTon();
				}
			}
		}
		return singleTon;
	}

	protected Object readResolve()
	{
		return singleTon;
	}

	public void getMethod()
	{
		System.out.println("in singleTon");
	}

}
