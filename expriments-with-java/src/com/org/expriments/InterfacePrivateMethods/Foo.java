package com.org.expriments.InterfacePrivateMethods;

public interface Foo
{
	// default method
	default void bar()
	{
		System.out.print("Hello");
		baz();
	}

	private void baz()
	{
		System.out.println(" world!");
	}

	// static method
	static void buzz()
	{
		System.out.print("Hello");
		staticBaz();
	}

	private static void staticBaz()
	{
		System.out.println(" static world!");
	}

}
