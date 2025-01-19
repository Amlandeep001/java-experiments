package com.org.expriments.singleton;

import java.io.Serializable;

/**
 * Implementing the thread-safe Singleton which will restrict the pattern breaking from Reflection, Serialization & Cloning.  
 */

public class SingleTon implements Serializable, Cloneable
{
	private static final long serialVersionUID = 3561009919119642904L;

	private volatile static SingleTon singleTon;

	private SingleTon()
	{ // Restrict breaking with Reflection
		if(singleTon != null)
		{
			throw new IllegalStateException("Object can't be created using Reflection");
		}
	}

	public static SingleTon getInstance()
	{
		if(singleTon == null)
		{
			synchronized(SingleTon.class)
			{
				// double locking will ensure of thread safety
				if(singleTon == null)
				{
					singleTon = new SingleTon();
				}
			}
		}
		return singleTon;
	}

	// Restrict the breaking with Singleton from Serialization
	protected Object readResolve()
	{
		return singleTon;
	}

	public void getMethod()
	{
		System.out.println("You are now okay to fetch whatever is required");
	}

	// Restrict the breaking with Cloning
	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		// TODO Auto-generated method stub
		// return super.clone();
		// throw new CloneNotSupportedException();
		return singleTon;
	}

}
