package com.org.codingninjas;

import java.util.ArrayList;
import java.util.Arrays;

//https://www.naukri.com/code360/problems/search-in-the-array_1116099?kunjiRedirection=true
public class SearchInTheArray
{
	public static void main(String[] args)
	{
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		ArrayList<Integer> queries = new ArrayList<>(Arrays.asList(2, 4));
		System.out.println(searchInTheArray(arr, queries, 5, 2));
	}

	public static ArrayList<Integer> searchInTheArray(ArrayList<Integer> arr, ArrayList<Integer> queries, int n, int q)
	{
		// Write your code here.

		ArrayList<Integer> sums = new ArrayList<>();

		for(int i = 0; i < q; i++)
		{
			int finalI = i;
			int sum = arr.stream()
					.filter(e -> e <= queries.get(finalI))
					.mapToInt(Integer::intValue)
					.sum();

			sums.add(sum);
		}

		return sums;
	}

}
