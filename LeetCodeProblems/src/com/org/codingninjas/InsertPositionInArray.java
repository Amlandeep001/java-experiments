package com.org.codingninjas;

import java.util.Arrays;

//https://www.codingninjas.com/studio/problems/algorithm-to-find-best-insert-position-in-sorted-array_839813?resumeRedirection=true&leftPanelTabValue=SUBMISSION
public class InsertPositionInArray
{
	public static int searchInsert(int[] arr, int m)
	{
		// Write your code here.

		if(arr.length == 0)
		{
			return 0;
		}
		else if(Arrays.binarySearch(arr, m) >= 0) // Applicable on sorted arrays only
		{
			return Arrays.binarySearch(arr, m);
		}
		else
		{
			for(int i = 0; i < arr.length; i++)
			{
				if(arr[i] > m)
				{
					return i == 0 ? 0 : i;
				}
				else if(m > arr[arr.length - 1])
				{
					return arr.length;
				}
			}
		}
		return 0;
	}

	public static void main(String[] args)
	{
		int[] arr = {1, 2, 4, 7};
		System.out.println(searchInsert(arr, 6));
	}
}
