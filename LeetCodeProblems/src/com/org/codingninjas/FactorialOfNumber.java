package com.org.codingninjas;

//https://www.naukri.com/code360/problems/moderate_6581534?topList=hcl-interview-questions&problemListRedirection=true&count=25&search=&sort_entity=order&sort_order=ASC&leftPanelTabValue=PROBLEM&customSource=studio_nav&attempt_status=ATTEMPTED
public class FactorialOfNumber
{
	public static void factorial(int n)
	{
		// Write your code here

		System.out.println(fact(n));
	}

	private static long fact(int n)
	{
		long result = 0L;
		if(n == 0)
		{
			result = 1;
		}
		if(n >= 1)
		{
			result = n * fact(n - 1);
		}
		return result;
	}

	public static void main(String[] args)
	{
		factorial(11);
	}
}
