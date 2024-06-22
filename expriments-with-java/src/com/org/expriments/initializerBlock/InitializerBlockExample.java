package com.org.expriments.initializerBlock;

public class InitializerBlockExample
{

	// Constructor
	InitializerBlockExample()
	{
		System.out.println("inside constructor");
	}

	// Initializer Block
	{
		System.out.println("inside initializer block"); // loads before the Constructor gets loaded
	}
	// Static Block
	static
	{
		System.out.println("static block 1");
	}

	public static void main(String[] args)
	{
		System.out.println("Main method");

		InitializerBlockExample abc = new InitializerBlockExample();
		System.out.println(abc.hashCode());
	}
}
