package com.org.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/contains-duplicate/description/
public class ContainsDuplicate
{
	public static boolean containsDuplicate(int[] nums)
	{
		Set<Integer> set = new HashSet<>();
		int[] newNums = Arrays.stream(nums)
				.filter(a -> !set.add(a))
				.toArray();

		if(newNums == null || newNums.length == 0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}

	public static void main(String[] args)
	{
		int[] nums = {1, 2, 3, 1};
		System.out.println(ContainsDuplicate.containsDuplicate(nums));
	}
}
