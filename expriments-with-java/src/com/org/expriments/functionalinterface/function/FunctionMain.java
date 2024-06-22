package com.org.expriments.functionalinterface.function;

public class FunctionMain
{
	public static void main(String[] args)
	{
		MultiArgFunction<Integer, Double, String, String> function = (i, d, s) -> "Integer: " + i + ", Double: " + d + ", String: " + s;

		String result = function.apply(42, 3.14, "Hello");
		System.out.println(result);
	}
}
