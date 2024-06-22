package com.org.codingninjas;

//https://www.codingninjas.com/studio/problems/missing-number_6680467?interviewProblemRedirection=true&leftPanelTabValue=PROBLEM&customSource=studio_nav
public class MissingNumber
{
	public static int missingNumber(int[] a, int N)
	{
		// Write your code here.

		int sum = 0;
		int sumMinusOne = 0;

		for(int i = 1; i <= N; i++)
		{
			sum += i;
		}

		for(Integer e : a)
		{
			sumMinusOne += e;
		}

		return Math.abs(sum - sumMinusOne);
	}

	public static void main(String[] args)
	{
		int[] arr = {1, 2, 4, 5};

		System.out.println(MissingNumber.missingNumber(arr, 5));
	}

}
