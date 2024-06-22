package org.sample;

import java.util.List;

public class FindOddNumbers
{
	public static void main(String args[])
	{
		List<Integer> intList = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

		intList.stream()
				.filter(digit -> digit % 2 != 0)
				.map(x -> x * x)
				.forEach(System.out::println);
	}
}
