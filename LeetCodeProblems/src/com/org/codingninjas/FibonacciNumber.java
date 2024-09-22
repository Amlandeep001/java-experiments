package com.org.codingninjas;

import java.util.Scanner;

//https://www.naukri.com/code360/problems/nth-fibonacci-number_74156?interviewProblemRedirection=true&leftPanelTabValue=PROBLEM
public class FibonacciNumber
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(fib(n));
		scanner.close();
	}

	private static int fib(int n)
	{
		if(n <= 1)
		{
			return n;
		}
		else
		{
			return fib(n - 1) + fib(n - 2);
		}
	}
}
