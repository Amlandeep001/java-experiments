package com.org.codingninjas;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//https://www.naukri.com/code360/problems/move-all-negative-numbers-to-beginning-and-positive-to-end_1112620?kunjiRedirection=true&leftPanelTabValue=PROBLEM
public class SeparateNegativePositive
{
	public static int[] separateNegativeAndPositive(int a[])
	{
		Map<Boolean, List<Integer>> map = Arrays.stream(a)
				.boxed()
				.collect(Collectors.partitioningBy(e -> e < 0));

		List<Integer> list = map.get(true);
		list.addAll(map.get(false));

		int[] arr = new int[list.size()];

		for(int i = 0; i < list.size(); i++)
		{
			arr[i] += list.get(i);
		}

		return arr;
	}

	public static void main(String[] args)
	{
		int[] a = new int[]{1, 2, -3, 4, -4, -5};
		System.out.println(Arrays.toString(separateNegativeAndPositive(a)));
	}
}
