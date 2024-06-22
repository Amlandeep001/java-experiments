package com.org.codingninjas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SingleElementInSortedArray
{
	public static int singleNonDuplicate(ArrayList<Integer> arr)
	{
		// Write your code here.

		return arr.stream()
				.filter(e -> Collections.frequency(arr, e) == 1)
				.findFirst()
				.get();
	}

	public static void main(String[] args)
	{
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 1, 3, 5, 5));
		System.out.println(SingleElementInSortedArray.singleNonDuplicate(arr));
	}
}
