package com.org.codingninjas;

import java.util.ArrayList;
import java.util.List;

public class MaxSubArrayElementList
{
	public static List<Integer> maximumInAllSubarraysOfSizeK(int[] arr, int n, int k)
	{
		// Write your code here!
		int greater = 0;
		List<Integer> ans = new ArrayList<>();
		int start = 0;
		if(k == 1)
		{
			for(int i = 0; i < n; i++)
			{
				ans.add(arr[i]);
			}
			return ans;
		}
		for(int i = 0; i < n; i++)
		{
			if(arr[i] >= greater)
			{
				greater = arr[i];
			}
			if(i - start + 1 == k)
			{
				ans.add(greater);
				start++;
			}
		}
		return ans;
	}
}
