package com.org.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Amlan
 * This class finds all majority elements in an array where the majority is defined as elements that appear more than n/3 times.
 * Link: https://leetcode.com/problems/majority-element-ii/description/
 */

public class MajorityElementII
{
	public static List<Integer> majorityElement(int[] nums)
	{
		int n = nums.length;
		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList<>();

		for(int i : nums)
		{
			map.put(i, map.getOrDefault(i, 0) + 1);
		}

		for(Map.Entry<Integer, Integer> entry : map.entrySet())
		{
			if(entry.getValue() > n / 3)
			{
				list.add(entry.getKey());
			}
		}

		return list;
	}

	public static void main(String[] args)
	{
		int[] input = {3, 2, 3, 2, 1, 1, 1, 1};

		List<Integer> result = majorityElement(input);
		System.out.println("Majority elements: " + result);
	}

}
