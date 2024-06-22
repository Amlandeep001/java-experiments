package com.org.codingninjas;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchInList
{
	public static int findKthElement(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k)
	{
		// Write your code here.

		arr1.addAll(arr2);
		arr1.sort(null); // null for natural order

		System.out.println(arr1.toString());

		return arr1.get(k - 1);
	}

	public static void main(String[] args)
	{
		ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1));
		ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(7));

		System.out.println(SearchInList.findKthElement(arr1, arr2, 2));
	}
}
