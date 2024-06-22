package com.org.codingninjas;

import java.util.HashSet;
import java.util.Set;

public class PairSum2
{
	public static int pairSum(int arr[], int n, int target)
	{
		// Write your code here.

		Set<int[]> intSet = new HashSet<>();

		for(int i = 0; i < n - 1; i++)
		{
			for(int j = i + 1; j < n; j++)
			{
				if(arr[i] + arr[j] == target)
				{
					intSet.add(new int[]{arr[i], arr[j]});
				}
			}
		}

		return intSet.size() != 0 ? intSet.size() : -1;
	}

	public static void main(String[] args)
	{
		int[] arr = new int[]{1, 2, 3, 4, 5};
		System.out.println(pairSum(arr, 5, 6));
	}
}
