package com.org.expriments.overriding;

class Parent
{
	// private methods are not overridden
	private void m1()
	{
		System.out.println("From parent m1()");
	}

	protected void m2()
	{
		System.out.println("From parent m2()");
	}

	static void m3()
	{
		System.out.println("From parent m3()");
	}
}

class Child extends Parent
{
	// new m1() method
	// unique to Child class
	private void m1()
	{
		System.out.println("From child m1()");
	}

	// overriding method
	// with more accessibility
	@Override
	public void m2()
	{
		System.out.println("From child m2()");
	}

	public static void m3()
	{
		System.out.println("From child m3()");
	}
}