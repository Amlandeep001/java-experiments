package com.org.codingninjas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ThreeSum
{
	public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int K)
	{
		// Write your code here.

		// Set<ArrayList<Integer>> intSet = new HashSet<>();
		ArrayList<ArrayList<Integer>> triplets = new ArrayList<>();
		HashSet<String> seenTriplets = new HashSet<>();

		for(int i = 0; i < n - 2; i++)
		{
			for(int j = i + 1; j < n - 1; j++)
			{
				for(int k = j + 1; k < n; k++)
				{
					if(arr[i] + arr[j] + arr[k] == K)
					{
						ArrayList<Integer> triplet = new ArrayList<>();
						triplet.addAll(Arrays.asList(arr[i], arr[j], arr[k]));
						triplet.sort(null); // Sort the triplet to ensure uniqueness
						String tripletString = triplet.toString();
						if(!seenTriplets.contains(tripletString))
						{
							seenTriplets.add(tripletString);
							triplets.add(triplet);
						}
					}
				}
			}
		}
		return triplets;
	}

	public static void main(String[] args)
	{
		int[] arr = {10, 5, 5, 5, 2};
		System.out.println(ThreeSum.findTriplets(arr, arr.length, 12));
	}
}
