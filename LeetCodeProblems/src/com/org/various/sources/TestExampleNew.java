package com.org.various.sources;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestExampleNew
{
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(1, 2, 2, 2, 3, 3, 4, 5, 1, 1, 56, 7, 8, 9, 10);

		List<Integer> dups = list.stream()
				.filter(e -> Collections.frequency(list, e) > 1)
				.distinct()
				.toList();

		System.out.println(dups);
	}
}
