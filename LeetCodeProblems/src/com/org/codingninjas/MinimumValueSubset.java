package com.org.codingninjas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//https://www.naukri.com/code360/problems/minimum-value_975388?interviewProblemRedirection=true&leftPanelTabValue=PROBLEM&count=25&search=&sort_entity=order&sort_order=ASC&customSource=studio_nav&page=1
public class MinimumValueSubset
{
	public static int minValue(ArrayList<Integer> arr, int n, int k)
	{
		// Write your code here.

		if(k > n)
		{
			throw new IllegalArgumentException("Subset size K cannot be larger than the array size.");
		}

		// Sort the array to easily find consecutive subsets
		Collections.sort(arr);

		// Initialize the minimum difference to a large number
		int minDifference = Integer.MAX_VALUE;

		// Use a sliding window to find the minimum difference in subsets of size K
		for(int i = 0; i <= n - k; i++)
		{
			// Difference between the maximum and minimum in the current subset
			int currentDifference = arr.get(i + k - 1) - arr.get(i);

			// Update the minimum difference if the current one is smaller
			if(currentDifference < minDifference)
			{
				minDifference = currentDifference;
			}
		}

		return minDifference;
	}

	public static void main(String[] args)
	{
		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1, 3, 5, 4, 4));
		System.out.println(minValue(arr, 5, 2));
	}
}
