package com.org.codingninjas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class SquareSortedArray
{
	public static ArrayList<Integer> sqsorted(ArrayList<Integer> arr)
	{
		// Write your code here.

		return (ArrayList<Integer>) arr.stream()
				.map(e -> e * e)
				.sorted()
				.collect(Collectors.toList());
	}

	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(-6, -3, 2, 1, 5));
		System.out.println(SquareSortedArray.sqsorted(al));
	}
}
