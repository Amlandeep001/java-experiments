package com.org.codingninjas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://www.codingninjas.com/studio/problems/longest-subset-zero-sum_920321?interviewProblemRedirection=true&leftPanelTabValue=PROBLEM&customSource=studio_nav
public class LongestSubarrayZeroSum
{
	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr)
	{
		// Write your code here.

		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, -1); // for a list which has only one element and that is 0
		int max_len = 0;
		int sum = 0;

		for(int i = 0; i < arr.size(); i++)
		{
			sum += arr.get(i);

			if(map.containsKey(sum))
			{
				int len = i - map.get(sum); // length of the sub_array = current_index - previous_index
				max_len = Math.max(max_len, len);
			}
			else
			{
				map.put(sum, i);
			}
		}
		return max_len;
	}

	public static void main(String[] args)
	{
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 3, -1, 4, -4));

		System.out.println(LongestSubarrayZeroSum.LongestSubsetWithZeroSum(arr));
	}
}
