package com.org.leetcode;

import java.util.Arrays;

//https://leetcode.com/problems/contains-duplicate/description/
public class ContainsDuplicate
{
    public static boolean containsDuplicate(int[] nums)
    {
		/*Set<Integer> set = new HashSet<>();
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
		}*/

        int length = Arrays.stream(nums).distinct().toArray().length;

        return length != nums.length;
    }

    public static void main(String[] args)
    {
        int[] nums = {1, 2, 3};
        System.out.println(containsDuplicate(nums));
    }
}
