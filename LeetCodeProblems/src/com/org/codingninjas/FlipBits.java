package com.org.codingninjas;

//https://www.codingninjas.com/studio/problems/flip-bits_1063248?interviewProblemRedirection=true&leftPanelTabValue=PROBLEM
public class FlipBits
{
	public static int flipBits(int[] arr, int n)
	{
		// Write your code here
		int count = 0;

		for(int i = 0; i < n; i++)
		{
			if(arr[i] == 1)
			{
				count++;
				arr[i] = -1;
			}
			else
			{
				arr[i] = 1;
			}
		}
		return(count + maxSubarraySum(arr, n));
	}

	public static int maxSubarraySum(int[] arr, int n)
	{
		int maxSum = Integer.MIN_VALUE;
		int currSum = 0;

		for(int i = 0; i < n; i++)
		{
			currSum += arr[i];

			maxSum = Math.max(maxSum, currSum);

			if(currSum < 0)
			{
				currSum = 0;
			}
		}

		return Math.max(maxSum, 0);
	}

	public static void main(String[] args)
	{
		int[] arr = {1, 0, 1, 0, 1, 0, 1, 0};
		System.out.println(flipBits(arr, 8));
	}
}
