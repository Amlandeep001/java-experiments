package com.org.various.sources;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElements
{
	public static void main(String[] args)
	{
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 8);

		List<Integer> commonElements = list1.stream()
				.filter(num -> list2.contains(num))
				.collect(Collectors.toList());

		System.out.println(commonElements);
	}
}
