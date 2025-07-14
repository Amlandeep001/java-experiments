package com.org.leetcode;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
public class RemoveDuplicatesFromArray
{
	public int removeDuplicates(int[] nums)
	{
		if(nums.length == 0)
		{
			return 0; // Edge case: empty array
		}

		int i = 0; // Pointer for placing unique elements

		for(int j = 0; j < nums.length; j++)
		{
			if(nums[j] != nums[i])
			{ // Found a new unique element
				i++;
				nums[i] = nums[j]; // Move unique element forward
			}
		}

		return i + 1; // Number of unique elements (k)
	}

	public static void main(String[] args)
	{
		int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
		RemoveDuplicatesFromArray rmd = new RemoveDuplicatesFromArray();
		System.out.println(rmd.removeDuplicates(nums));
	}
}
