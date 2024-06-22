package com.org.codingninjas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class SecondLargestInArray
{

	public static int findSecondLargest(int n, int[] arr)
	{
		// Write your code here.

		Optional<Integer> secondLargest = Arrays.stream(arr)
				.boxed()
				.distinct()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst();

		return secondLargest.isPresent() ? secondLargest.get() : -1;
	}

	public static void main(String[] args)
	{
		int[] arr = {-10, -40, -25, -12, -25, -10};
		System.out.println(SecondLargestInArray.findSecondLargest(6, arr));
	}

}
