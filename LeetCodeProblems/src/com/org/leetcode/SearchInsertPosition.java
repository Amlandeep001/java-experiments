package com.org.leetcode;

public class SearchInsertPosition
{
	public int searchInsert(int[] nums, int target)
	{
		for(int i = 0; i < nums.length; i++)
		{
			if(nums[i] == target)
			{
				return i;
			}
			else if(nums[i] > target)
			{
				return i;
			}
		}

		if(nums[nums.length - 1] < target)
		{
			return nums.length;
		}
		else
		{
			return -1;
		}
	}

	public static void main(String[] args)
	{
		int[] nums = {1, 3, 5, 6};

		SearchInsertPosition sip = new SearchInsertPosition();
		System.out.println(sip.searchInsert(nums, 5));
	}

}
