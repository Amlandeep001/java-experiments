package com.org.expriments.defaultAndStatic;

/**
 * Q: Why default and static methods were introduced in Java 8?
 * A: If they add them as static methods, then programmers would regard them as utility methods,
 * not as essential, core methods. Default methods enable you to add new functionality to the
 * interfaces of your libraries and ensure binary compatibility with code written for older versions
 * of those interfaces.
 */
public interface Java8DefaultAndStatic
{
	// abstract method
	void square(int a);

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
