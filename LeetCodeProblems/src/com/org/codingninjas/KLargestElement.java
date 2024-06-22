package com.org.codingninjas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://www.codingninjas.com/studio/problems/k-largest-element_1062624?interviewProblemRedirection=true&leftPanelTabValue=PROBLEM
public class KLargestElement
{
	public static int[] Klargest(int[] a, int k, int n)
	{
		// Write your code here

		Arrays.sort(a);
		List<Integer> list = new ArrayList<>();

		for(int i = n - 1; i >= n - k; i--)
		{
			list.add(a[i]);
		}

		return list.stream()
				.sorted()
				.mapToInt(Integer::intValue)
				.toArray();
	}

	public static void main(String[] args)
	{
		int[] a = {3, 4, 2, 1};
		System.out.println(Arrays.toString(Klargest(a, 2, 4)));
	}

}
