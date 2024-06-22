package com.org.codingninjas;

import java.util.Arrays;

//https://www.naukri.com/code360/problems/print-fibonacci-series_7410103?topList=ninjas-sde-sheet&problemListRedirection=true&leftPanelTabValue=PROBLEM&count=25&search=&sort_entity=order&sort_order=ASC&customSource=studio_nav&page=1&attempt_status=ATTEMPTED
public class PrintFibonacciSeries
{
	public static int[] generateFibonacciNumbers(int n)
	{
		// Write your code here.

		int[] arr = new int[n];

		for(int i = 0; i < n; i++)
		{
			arr[i] = fib(i);
		}

		return arr;
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

	public static void main(String[] args)
	{
		System.out.println(Arrays.toString(generateFibonacciNumbers(5)));
	}
}
