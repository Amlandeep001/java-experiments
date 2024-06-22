package com.org.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/merge-sorted-array/
public class MergeArrays
{
	public static void merge(int[] nums1, int m, int[] nums2, int n)
	{
		List<Integer> nums1List = new ArrayList<>();
		List<Integer> nums2List = new ArrayList<>();

		// List<Integer> list = new ArrayList<Integer>(Collections.nCopies(n, 0));

		for(int i = 0; i < m; i++)
		{
			nums1List.add(nums1[i]);
		}

		// nums1List.removeAll(list);

		for(int j = 0; j < n; j++)
		{
			nums2List.add(nums2[j]);
		}

		nums1List.addAll(nums2List);
		nums1List.sort(null);

		int[] mergedSortedArr = nums1List.stream()
				.mapToInt(Integer::intValue)
				.toArray();

		System.out.println(Arrays.toString(mergedSortedArr));
	}

	public static void main(String[] args)
	{
		int[] nums1 = {1, 2, 3, 0, 0, 0};
		int[] nums2 = {2, 5, 6};

		merge(nums1, 3, nums2, 3);
	}
}
