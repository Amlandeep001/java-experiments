package com.org.geeksforgeeks;

import java.util.Arrays;

//https://www.geeksforgeeks.org/problems/second-largest3735/1?page=1&category=Arrays&sortBy=submissions
public class SecondLargestElement
{
	static int print2largest(int arr[], int n)
	{
		// code here

		if(arr.length >= 2)
		{
			Arrays.sort(arr);

			for(int i = n - 1; i >= 0; i--)
			{
				if(arr[i] != arr[n - 1])
				{
					return arr[i];
				}
			}
		}

		return -1;
	}

	public static void main(String[] args)
	{
		int arr[] = {12, 35, 1, 10, 34, 1};
		int n = arr.length;
		System.out.println(print2largest(arr, n));
	}

}