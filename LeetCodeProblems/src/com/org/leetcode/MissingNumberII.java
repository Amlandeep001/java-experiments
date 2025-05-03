package com.org.leetcode;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// https://leetcode.com/problems/missing-number
public class MissingNumberII
{
	public static int missingNumber(int[] nums)
	{
		/*int sum = Arrays.stream(nums)
				.sum();
		
		int superSum = IntStream.rangeClosed(0, nums.length)
				.sum();
		
		return superSum - sum;*/

		Arrays.sort(nums);
		Set<Integer> set = Arrays.stream(nums)
				.boxed()
				.collect(Collectors.toSet());
		if(nums[0] == 0)
		{
			return IntStream.rangeClosed(0, nums.length)
					.filter(num -> !set.contains(num))
					.findFirst()
					.getAsInt();
		}
		else
		{
			return 0;
		}
	}

	public static void main(String[] args)
	{
		int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
		System.out.println(missingNumber(nums)); // Output: 8
	}
}
