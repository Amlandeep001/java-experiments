package com.org.leetcode;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//https://leetcode.com/problems/single-number/description/
public class SingleNumber
{
	public static int singleNumber(int[] nums)
	{
		Map<Integer, Long> map = Arrays.stream(nums)
				.boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		for(Map.Entry<Integer, Long> entry : map.entrySet())
		{
			if(entry.getValue() != 2)
			{
				return entry.getKey();
			}
		}
		return 0;
	}

	public static void main(String[] args)
	{
		int[] arr = {4, 1, 2, 1, 2};
		System.out.println(SingleNumber.singleNumber(arr));
	}
}
