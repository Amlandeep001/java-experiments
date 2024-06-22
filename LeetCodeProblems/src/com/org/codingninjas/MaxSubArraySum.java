package com.org.codingninjas;

//https://www.codingninjas.com/studio/problems/maximum-subarray-sum_630526?interviewProblemRedirection=true&leftPanelTabValue=PROBLEM

//Kaden's Algorithm
public class MaxSubArraySum
{
	public static long maxSubarraySum(int[] arr, int n)
	{
		/*long maxSum = Long.MIN_VALUE;
		long currSum = 0;
		
		for(int i = 0; i < n; i++)
		{
			currSum += arr[i];
		
			maxSum = Math.max(maxSum, currSum);
		
			if(currSum < 0)
			{
				currSum = 0;
			}
		}
		return Math.max(maxSum, 0);*/

		long maxSum = arr[0];
		long currSum = arr[0];

		for(int i = 1; i < n; i++)
		{
			currSum = Math.max(arr[i], currSum + arr[i]);
			maxSum = Math.max(maxSum, currSum);
		}
		return maxSum < 0 ? 0 : maxSum;
	}

	public static void main(String[] args)
	{
		int[] arr = {1, 2, 7, -4, 3, 2, -10, 9, 1};

		System.out.println(maxSubarraySum(arr, 9));
	}
}
