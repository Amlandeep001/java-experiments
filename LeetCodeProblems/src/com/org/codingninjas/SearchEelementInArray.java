package com.org.codingninjas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://www.naukri.com/code360/problems/binary-search_975480?topList=tcs-interview-questions&problemListRedirection=true&leftPanelTabValue=PROBLEM
public class SearchEelementInArray
{
	public static List<Integer> searchInSortedArray(int[] arr, int n, int[] queries, int q)
	{
		// Write your code here.

		List<Integer> result = new ArrayList<>();

		for(int x = 0; x < q; x++)
		{
			if(Arrays.binarySearch(arr, queries[x]) >= 0)
			{
				result.add(1);
			}
			else
			{
				result.add(0);
			}
		}

		return result;
	}

	public static void main(String[] args)
	{
		int[] arr = {1, 2, 2, 3, 4, 10};
		int[] queries = {5, 7, 2};

		System.out.println(searchInSortedArray(arr, 6, queries, 3));
	}

}
