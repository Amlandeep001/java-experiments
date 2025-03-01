package com.org.expriments.overriding.constructor;

public class A
{
	A()
	{
		System.out.println("Constructor of class A");
	}

	public void test()
	{
		System.out.println("This is test() of Superclass");
	}
}

class B extends A
{
	B()
	{
		System.out.println("Constructor of class B");
	}

	public void test()
	{
		System.out.println("This is test() of Subclass");
	}
}
