package com.org.expriments.functionalinterface;

public class Operation
{
	public static void main(String[] args)
	{
		FInterface total = (a, b) -> a * b;

		System.out.println(total.multiply(6, 7));
	}
}
