package com.org.codingninjas;

public class CountInversions
{
	public static long getInversions(long arr[], int n)
	{
		// Write your code here.

		long count = 0L;

		for(int i = 0; i < n - 1; i++)
		{
			for(int j = i + 1; j < n; j++)
			{
				if(arr[i] > arr[j])
				{
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args)
	{
		long arr[] = {3, 2, 1};
		System.out.println(CountInversions.getInversions(arr, 3));
	}
}
