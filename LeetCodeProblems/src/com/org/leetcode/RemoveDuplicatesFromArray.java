package com.org.leetcode;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
public class RemoveDuplicatesFromArray
{
	public int removeDuplicates(int[] nums)
	{
		int j = 0;
		for(int i = 0; i < nums.length; i++)
		{
			if(nums[j] != nums[i])
			{
				j++;
				nums[j] = nums[i];
			}
		}
		return j + 1;
	}

	public static void main(String[] args)
	{
		int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
		RemoveDuplicatesFromArray rmd = new RemoveDuplicatesFromArray();
		System.out.println(rmd.removeDuplicates(nums));
	}
}
