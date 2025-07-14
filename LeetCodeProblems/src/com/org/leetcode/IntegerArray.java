package com.org.leetcode;

import java.util.Arrays;

//
public class IntegerArray
{
	public int[] twoSum(int[] nums, int target)
	{
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = i + 1; j < nums.length; j++)
			{
				if(nums[i] + nums[j] == target)
				{
					return new int[]{i, j};
				}
			}
		}
		return null;
	}

	public static void main(String[] args)
	{
		int[] nums = {3, 2, 4};
		int target = 6;
		IntegerArray intArray = new IntegerArray();
		System.out.println(Arrays.toString(intArray.twoSum(nums, target)));
	}

}
