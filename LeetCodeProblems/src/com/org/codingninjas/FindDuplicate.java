package com.org.codingninjas;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//https://www.codingninjas.com/studio/problems/find-duplicate_625160?topic=arrays&interviewProblemRedirection=true&leftPanelTabValue=PROBLEM&customSource=studio_nav
public class FindDuplicate
{
	public static int duplicateNumber(int arr[])
	{
		// Your code goes here

		Set<Integer> set = new HashSet<>();
		return Arrays.stream(arr)
				.boxed()
				.filter(e -> !set.add(e))
				.findFirst()
				.get();
	}

	public static void main(String[] args)
	{
		int arr[] = {0, 7, 2, 5, 4, 7, 1, 3, 6};
		System.out.println(duplicateNumber(arr));
	}
}
