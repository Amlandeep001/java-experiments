package com.org.codingninjas;

//https://www.codingninjas.com/studio/problems/sum-of-even-numbers-till-n_893205?interviewProblemRedirection=true&leftPanelTabValue=PROBLEM
public class SumOfEvens
{
	public static long evenSumTillN(int n)
	{
		// Write your code here.

		long sum = 0;

		for(long i = 1; i <= n; i++)
		{
			if(i % 2 == 0)
			{
				sum += i;
			}
		}

		return sum;
	}

	public static void main(String[] args)
	{
		System.out.println(evenSumTillN(6));
	}

}
