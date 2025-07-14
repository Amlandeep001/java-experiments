package com.org.leetcode;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * https://leetcode.com/problems/intersection-of-two-arrays/description/
 */
public class ArrayIntersection
{
	public int[] intersection(int[] nums1, int[] nums2)
	{
		return Arrays.stream(nums1)
				.boxed()
				.filter(new LinkedList<>(Arrays.stream(nums2).boxed().toList())::remove)
				.distinct()
				.mapToInt(Integer::intValue)
				.toArray();
	}

	public static void main(String[] args)
	{
		int[] nums1 = {1, 2, 2, 3, 3, 4, 5};
		int[] nums2 = {1, 2, 2, 3};

		ArrayIntersection ai = new ArrayIntersection();
		System.out.println(Arrays.toString(ai.intersection(nums1, nums2)));
	}

}
