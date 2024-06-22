package com.org.preparation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8ArrayProblems
{
	private static void fetchSecondSmallest(int[] numbers)
	{
		int secondSmallest = Arrays.stream(numbers)
				.sorted()
				.distinct()
				.skip(1)
				.findFirst()
				.orElseThrow(() -> new IllegalArgumentException("Array doesn't have the second smallest element"));

		System.out.println("Second smallest element is: " + secondSmallest);
	}

	private static void fetchCommonElements(int[] array1, int[] array2)
	{
		List<Integer> commonElements = Arrays.stream(array1)
				.filter(number -> Arrays.stream(array2).anyMatch(arr2Number -> arr2Number == number))
				.boxed()
				.collect(Collectors.toList());

		System.out.println("Common elements are: " + commonElements);
	}

	private static void reverseGivenArrayInPLace(int[] arr)
	{
		IntStream.range(0, arr.length / 2).forEach(i ->
		{
			int temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		});

		System.out.println("Reversed Array: " + Arrays.toString(arr));
	}

	private static void fetchLengthOfLongestStringInArray(String[] strings)
	{
		int lengthOfLongestString = Arrays.stream(strings)
				.mapToInt(String::length)
				.max()
				.orElse(0);

		String longestString = Arrays.stream(strings)
				.max(Comparator.comparing(String::length))
				.get();

		System.out.println("Length of longest string: " + lengthOfLongestString);
		System.out.println("longest string: " + longestString);
	}

	public static void main(String[] args)
	{
		int[] numbers = {5, 2, 8, 3, 1, 1};
		fetchSecondSmallest(numbers);

		System.out.println("**********************************************************");

		int[] array1 = {1, 2, 3, 4, 5};
		int[] array2 = {4, 5, 6, 7, 8};

		fetchCommonElements(array1, array2);

		System.out.println("**********************************************************");

		int[] arr = {1, 2, 3, 4, 5};

		reverseGivenArrayInPLace(arr);

		System.out.println("**********************************************************");

		String[] strings = {"Apple", "Banana", "Avocado", "Apricot", "Grapes"};

		fetchLengthOfLongestStringInArray(strings);
	}

}
