package org.sample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SampleMain
{

	public static void main(String args[])
	{
		System.out.println("Hello main..");

		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);

		intList.stream()
				.map(n ->
				{
					System.out.println(n);
					return n;
				})
				.collect(Collectors.toList());

		intList.stream()
				.map(a -> a * a)
				.filter(b -> b % 2 == 0)
				.forEach(System.out::println);
	}
}
