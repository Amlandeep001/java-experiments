package com.org.codingninjas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

//https://www.codingninjas.com/studio/problems/find-similarities-between-two-arrays_1229070?interviewProblemRedirection=true&leftPanelTabValue=PROBLEM
public class IntersectionUnion
{
	public static ArrayList<Integer> findSimilarity(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n, int m)
	{
		// Write your code here.

		long intersection = arr1.stream()
				.filter(arr2::contains)
				.count();

		long union = Stream.concat(arr1.stream(), arr2.stream())
				.distinct()
				.count();
		return new ArrayList<>(Arrays.asList((int) intersection,
				(int) union));
	}

	public static void main(String[] args)
	{
		ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 2));
		ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(3, 4));

		System.out.println(findSimilarity(arr1, arr2, 2, 2));
	}
}
