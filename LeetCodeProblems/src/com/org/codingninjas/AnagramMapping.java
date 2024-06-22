package com.org.codingninjas;

import java.util.Arrays;
import java.util.HashMap;

//https://www.codingninjas.com/studio/problems/anagram-mapping_3125901?interviewProblemRedirection=true&leftPanelTabValue=PROBLEM
public class AnagramMapping
{
	public static int[] anagramMapping(int n, int[] a, int[] b)
	{
		// Write your code here.

		/*int[] arr = new int[n];
		
		List<Integer> bl = Arrays.stream(b)
				.boxed()
				.collect(Collectors.toList());
		
		for(int i = 0; i < n; i++)
		{
			arr[i] = bl.indexOf(a[i]);
		}
		
		return arr;*/

		HashMap<Integer, Integer> indexMap = new HashMap<>();
		int[] mapping = new int[n];

		// Build index map for array B
		for(int i = 0; i < n; i++)
		{
			indexMap.put(b[i], i);
		}

		// Find index mapping for array A
		for(int i = 0; i < n; i++)
		{
			mapping[i] = indexMap.get(a[i]);
		}

		return mapping;
	}

	public static void main(String[] args)
	{
		int[] a = {10, 20, 30, 40, 50}, b = {20, 10, 40, 50, 30};

		System.out.println(Arrays.toString(anagramMapping(5, a, b)));
	}
}
