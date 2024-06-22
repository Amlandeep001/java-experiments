package com.org.codingninjas.sorting;

import java.util.Arrays;

//https://www.codingninjas.com/studio/problems/selection-sort_981162?interviewProblemRedirection=true&leftPanelTabValue=PROBLEM
public class SelectionSort
{
	public static void selectionSort(int arr[], int n)
	{
		for(int i = 0; i < n; i++)
		{
			int min = i;
			// Iterating from i + 1 to n
			for(int j = i + 1; j < n; j++)
			{
				// If arr[j] is smaller than arr[min]
				// then updating the min.
				if(arr[j] < arr[min])
				{
					min = j;
				}
			}

			// Swapping arr[i] with arr[min].
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args)
	{
		int arr[] = {38, 52, 9, 18, 6, 62, 13};
		SelectionSort.selectionSort(arr, 7);
	}

}
