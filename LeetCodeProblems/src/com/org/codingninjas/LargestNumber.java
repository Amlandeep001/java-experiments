package com.org.codingninjas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//https://www.codingninjas.com/studio/problems/largest-positive-and-negative-k_2196191?interviewProblemRedirection=true&leftPanelTabValue=PROBLEM&count=25&page=6&search=&difficulty%5B%5D=Easy&sort_entity=order&sort_order=ASC
public class LargestNumber
{
	public static int largestNumber(int[] arr, int n)
	{
		// Write your code here

		List<Integer> il = Arrays.stream(arr)
				.boxed()
				.collect(Collectors.toList());

		List<Integer> newB = new ArrayList<>();

		for(int i = 0; i < n; i++)
		{
			if(il.contains(Math.negateExact(il.get(i))))
			{
				newB.add(il.get(i));
			}
		}

		if(newB.size() > 0)
		{
			newB.sort(Comparator.reverseOrder());
			return newB.get(0);
		}

		return -1;
	}

	public static void main(String[] args)
	{
		int[] arr = {3, 2, -2, 5, -3};
		System.out.println(LargestNumber.largestNumber(arr, 5));
	}
}
