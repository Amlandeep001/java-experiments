package org.sample;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates2
{
	public static void main(String[] args)
	{
		List<Integer> intList = List.of(0, 1, 0, 2, 0, 7, 5, 2, 3, 4, 5, 6, 7, 8, 9);

		Set<Integer> intSet = new HashSet<>();

		intList.stream()
				.filter(a -> !intSet.add(a))
				.distinct()
				.forEach(System.out::println);
	}
}
