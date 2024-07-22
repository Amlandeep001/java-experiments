package com.org.leetcode;

import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/squares-of-a-sorted-array/?envType=daily-question&envId=2024-07-22
public class SquaresOfSortedArray
{
	public static void main(String[] args)
	{
		int[] nums = {-4, -1, 0, 3, 10};
		int[] squares = sortedSquares(nums);
		for(int num : squares)
		{
			System.out.print(num + " ");
		}
	}

	public static int[] sortedSquares(int[] nums)
	{
		List<Integer> list = Arrays.stream(nums)
				.boxed()
				.toList();

		return list.stream()
				.map(e -> e * e)
				.sorted()
				.mapToInt(Integer::intValue)
				.toArray();
	}
}
