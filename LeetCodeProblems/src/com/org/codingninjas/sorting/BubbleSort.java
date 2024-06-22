package com.org.codingninjas.sorting;

import java.util.Arrays;

//https://www.codingninjas.com/studio/problems/bubble-sort_980524?interviewProblemRedirection=true&leftPanelTabValue=PROBLEM
public class BubbleSort
{
	public static void bubbleSort(int[] arr, int n)
	{
		// Write your code here.

		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n - 1; j++)
			{
				if(arr[j] > arr[j + 1])
				{
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args)
	{
		int[] arr = {6, 2, 8, 4, 10};
		BubbleSort.bubbleSort(arr, 5);
	}
}
