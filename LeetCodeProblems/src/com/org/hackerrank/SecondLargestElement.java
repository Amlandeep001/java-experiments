package com.org.hackerrank;

import java.util.Arrays;

public class SecondLargestElement
{
	public static Integer findSecondLargest(Integer[] numbers)
	{
		if(numbers.length < 2)
		{
			// Handle the case when there are fewer than two elements
			return null;
		}

		/*return Arrays.stream(numbers)
				.distinct() // Remove duplicates
				.reduce((first, second) -> (first > second) ? first : second) // Find the maximum
				.flatMap(max -> Arrays.stream(numbers)
						.filter(num -> !num.equals(max)) // Exclude the maximum
						.reduce((first, second) -> (first > second) ? first : second)) // Find the second maximum
				.orElse(null);*/

		Integer first = Arrays.stream(numbers)
				.distinct()
				.max((a, b) -> a.compareTo(b))
				.get();
		Integer second = Arrays.stream(numbers)
				.filter(x -> x < first)
				.max((x, y) -> x.compareTo(y))
				.get();

		return second;

		/*return Arrays.stream(numbers)
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst()
				.get();*/
	}

	public static void main(String[] args)
	{
		Integer[] numbers = {5, 8, 2, 10, 7, 2, 4, 11, 9};
		System.out.println("Second Largest Element: " + findSecondLargest(numbers));
	}
}
