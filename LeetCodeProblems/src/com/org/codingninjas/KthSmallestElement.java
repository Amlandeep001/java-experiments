package com.org.codingninjas;

import java.util.Arrays;

//https://www.naukri.com/code360/problems/kth-smallest-element_893056?topList=top-array-coding-interview-questions&problemListRedirection=true&page=2&leftPanelTabValue=PROBLEM
public class KthSmallestElement
{
	public static void main(String[] args)
	{
		int[] arr = {7, 2, 6, 1, 9};
		System.out.println(kthSmallest(5, 3, arr));
	}

	private static int kthSmallest(int n, int k, int[] arr)
	{
		// Write your code here.

		return Arrays.stream(arr)
				.sorted()
				.skip(k - 1)
				.findFirst()
				.getAsInt();
	}
}
