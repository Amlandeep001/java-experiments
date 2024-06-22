package com.org.expriments.staticBlock;

public class StaticBlockExample
{

	// Case 1: Static variable
	static int i;
	// Case 2: non-static variables
	int j;

	// Case 3: Static block
	// Start of static block
	static
	{
		i = 10;
		System.out.println("static block called ");
	}
	// End of static block
}
