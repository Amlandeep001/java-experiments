package com.org.leetcode;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/?envType=study-plan-v2&envId=top-interview-150
public class RemoveDupliactesDromSortedArray
{
	public static int removeDuplicates(int[] nums)
	{
		if(nums.length <= 2)
		{
			return nums.length;
		}

		int i = 2; // Start the unique elements index from the third position

		for(int j = 2; j < nums.length; j++)
		{
			// If the current element is not a third occurrence of the same value
			if(nums[j] != nums[i - 2])
			{
				nums[i] = nums[j]; // Move the valid element to the position `i`
				i++; // Increment the unique index
			}
		}

		return i; // New length of the modified array
	}

	public static void main(String[] args)
	{
		int[] nums = {1, 1, 1, 2, 2, 3};
		System.out.println(removeDuplicates(nums));
	}
}
