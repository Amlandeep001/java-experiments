package com.org.codingninjas;

public class Patternify
{
	public static String[] printPatt(int n)
	{
		// Write your code here

		String[] pattern = new String[n];

		for(int i = 0; i < n; i++)
		{
			pattern[i] = "*".repeat(n - i);
		}
		return pattern;
	}

	public static void main(String[] args)
	{
		int n = 5;
		String[] pattern = printPatt(n);

		for(String line : pattern)
		{
			System.out.println(line);
		}
	}
}