package com.org.codingninjas;

import java.util.Arrays;
import java.util.Comparator;

//https://www.naukri.com/code360/problems/fourth-largest-element-in-the-array_630422?interviewProblemRedirection=true&leftPanelTabValue=PROBLEM&count=25&page=1&search=Fourth&sort_entity=order&sort_order=ASC&customSource=studio_nav
public class FourthHighestElement
{
	public static int getFourthLargest(int[] arr)
	{
		// Your code goes here

		return Arrays.stream(arr)
				.boxed()
				.sorted(Comparator.reverseOrder())
				.skip(3)
				.findFirst()
				.orElse(Integer.MIN_VALUE);
	}

	public static void main(String[] args)
	{
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println("Fourth highest element: " + getFourthLargest(arr));
	}
}
