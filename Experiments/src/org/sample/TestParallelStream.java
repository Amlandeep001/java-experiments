package org.sample;

import java.util.Arrays;
import java.util.List;

public class TestParallelStream
{
	public static void main(String[] args)
	{
		List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4);

		int sum = listOfNumbers.parallelStream()
				.mapToInt(Integer::intValue)
				.sum();

		int sumAl = listOfNumbers.parallelStream()
				.reduce(5, Integer::sum); // result = 30 as 5 is getting added with each element running in parallel

		int sumPS = listOfNumbers.parallelStream()
				.sequential()
				.reduce(5, Integer::sum); // result = 15 as 5 is getting added with the sum at the end as sequential() makes parallel to sequential again

		int sumPFP = listOfNumbers.parallelStream()
				.flatMap(num -> Arrays.asList(num).stream())
				// .flatMap(Stream::of)
				.reduce(0, Integer::sum);

		System.out.println(sum);
		System.out.println(sumAl);
		System.out.println(sumPS);
		System.out.println(sumPFP);
	}

}
