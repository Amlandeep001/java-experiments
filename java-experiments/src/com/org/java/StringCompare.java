package com.org.java;

import java.util.function.BiFunction;

public class StringCompare
{
	public static void main(String[] args)
	{
		BiFunction<String, String, Boolean> compareString = (x, y) -> x.equals(y);
		System.out.println(compareString.apply("Java8", "Java8"));
	}
}
