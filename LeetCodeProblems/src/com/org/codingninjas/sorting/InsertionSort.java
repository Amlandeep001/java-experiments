package com.org.codingninjas.sorting;

import java.util.Arrays;

//https://www.codingninjas.com/studio/problems/insertion-sort_3155179?interviewProblemRedirection=true&leftPanelTabValue=SUBMISSION
//Explanation: https://www.youtube.com/watch?v=TKIAVBsCLqk&t=544s
public class InsertionSort
{
	public static void insertionSort(int n, int[] arr)
	{
		// Write your code here.

		for(int i = 1; i < n; i++)
		{
			int temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > temp)
			{
				arr[j + 1] = arr[j]; // swapping when arr[j] > arr[i]
				j = j - 1; // to work with next element of the sorted list
			}
			arr[j + 1] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args)
	{
		int[] arr = {5, 1, 9, 2, 10};
		InsertionSort.insertionSort(5, arr);
	}
}
