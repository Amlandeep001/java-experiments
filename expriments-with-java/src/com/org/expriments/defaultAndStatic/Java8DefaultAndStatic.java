package com.org.expriments.defaultAndStatic;

public interface Java8DefaultAndStatic
{
	// abstract method
	public void square(int a);

	// default method
	default void voidShow()
	{
		System.out.println("Default Method Executed");
	}

	// static method
	static void staticShow()
	{
		System.out.println("Static Method Executed");
	}
}
