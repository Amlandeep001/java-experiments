package com.org.codingninjas;

import java.util.HashMap;
import java.util.Map;

//https://www.naukri.com/code360/problems/longest-subarray-with-sum-k_6682399?topList=ninjas-sde-sheet&problemListRedirection=true&leftPanelTabValue=PROBLEM&count=25&page=1&search=&sort_entity=order&sort_order=ASC&customSource=studio_nav
public class LongestSubArrayWithSumK
{
	public static int longestSubarrayWithSumK(int[] a, long k)
	{
		// Write your code here

		// Initialize variables
		int maxLength = 0;
		int sum = 0;
		Map<Integer, Integer> map = new HashMap<>(); // Map to store the prefix sum and its index

		// Iterate through the array
		for(int i = 0; i < a.length; i++)
		{
			// Update the sum
			sum += a[i];

			// If the sum equals k, update the maxLength
			if(sum == k)
			{
				maxLength = i + 1;
			}

			// If (sum - k) is present in the map, update the maxLength
			if(map.containsKey((int) (sum - k)))
			{
				maxLength = Math.max(maxLength, i - map.get((int) (sum - k)));
			}

			// If the sum is not present in the map, put it in the map
			if(!map.containsKey(sum))
			{
				map.put(sum, i);
			}
		}

		return maxLength;
	}
}
