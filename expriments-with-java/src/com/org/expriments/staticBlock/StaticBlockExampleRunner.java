package com.org.expriments.staticBlock;

// Class 2
// Main class
public class StaticBlockExampleRunner
{
	// Main driver method
	public static void main(String args[])
	{
		// Although we don't have an object of Test, static
		// block is called because i is being accessed in
		// following statement.
		System.out.println(StaticBlockExample.i);
	}
}
