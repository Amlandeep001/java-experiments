package com.org.leetcode;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/subarray-sum-equals-k/
public class SubArraySumEqualsK
{
	public static int subarraySum(int[] nums, int k)
	{
		Map<Integer, Integer> sumFrequency = new HashMap<>();
		sumFrequency.put(0, 1); // Base case: there's one way to have a cumulative sum of 0 (empty subarray)

		int count = 0;
		int cumulativeSum = 0;

		for(int num : nums)
		{
			cumulativeSum += num;

			// Check if there's a subarray (ending here) whose sum is `k`
			if(sumFrequency.containsKey(cumulativeSum - k))
			{
				count += sumFrequency.get(cumulativeSum - k);
			}

			// Update the cumulative sum frequency map
			sumFrequency.put(cumulativeSum, sumFrequency.getOrDefault(cumulativeSum, 0) + 1);
		}

		return count;
	}

	public static void main(String[] args)
	{
		int[] nums = {1, 2, 3};
		System.out.println(subarraySum(nums, 3));
	}
}
