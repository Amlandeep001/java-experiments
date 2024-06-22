package com.org.codingninjas;

import java.util.ArrayList;
import java.util.Arrays;

//https://www.naukri.com/code360/problems/find-minimum-sum-subarray-of-given-size_873368?interviewProblemRedirection=true
public class MinSubArray
{
	public static int minSubarraySum(ArrayList<Integer> arr, int n, int k)
	{
		// Write your code here.

		// Compute sum of first subarray of size k
		int ans = 0;
		for(int i = 0; i < k; i++)
		{
			ans += arr.get(i);
		}

		System.out.println(ans);

		// Compute sums of remaining subarrays by
		// removing first element of previous
		// subarray and adding last element of
		// current subarray.
		int sum = ans;
		for(int i = k; i < n; i++)
		{
			sum += arr.get(i) - arr.get(i - k);
			ans = Math.min(ans, sum);
		}

		return ans;
	}

	public static void main(String[] args)
	{
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(10, 4, 2, 5, 6, 3, 8, 1));
		System.out.println(minSubarraySum(arr, 8, 3));
	}
}
