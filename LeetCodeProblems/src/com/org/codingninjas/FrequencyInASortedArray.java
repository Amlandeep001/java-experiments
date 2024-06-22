package com.org.codingninjas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//https://www.codingninjas.com/studio/problems/frequency-in-a-sorted-array_893286?interviewProblemRedirection=true&leftPanelTabValue=PROBLEM&customSource=studio_nav
public class FrequencyInASortedArray
{
	public static int countOccurrences(int[] arr, int x)
	{
		// Write your code here.

		List<Integer> al = Arrays.stream(arr)
				.boxed()
				.collect(Collectors.toList());
		if(al.contains(x))
		{
			return Collections.frequency(al, x);
		}
		else
		{
			return 0;
		}
	}

	public static void main(String[] args)
	{
		int[] arr = {1, 1, 2, 2, 2, 2, 3};
		System.out.println(countOccurrences(arr, 2));
	}
}
