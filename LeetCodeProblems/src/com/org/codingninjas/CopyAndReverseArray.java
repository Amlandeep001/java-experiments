package com.org.codingninjas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://www.codingninjas.com/studio/problems/copy-and-reverse-the-array_1058196?interviewProblemRedirection=true&leftPanelTabValue=PROBLEM&customSource=studio_nav
public class CopyAndReverseArray
{
	public static int[] copyAndReverse(int[] arr, int n)
	{
		// Write your code here.

		List<Integer> list = new ArrayList<>();

		for(int i = n - 1; i >= 0; i--)
		{
			list.add(arr[i]);
		}

		return list.stream()
				.mapToInt(Integer::intValue)
				.toArray();
	}

	public static void main(String[] args)
	{
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(copyAndReverse(arr, 5)));
	}
}
