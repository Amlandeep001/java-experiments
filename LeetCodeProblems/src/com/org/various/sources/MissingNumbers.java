package com.org.various.sources;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingNumbers
{
	public static void main(String[] args)
	{
		int[] arr = {1, 2, 4, 5, 7, 8};
		System.out.println(Arrays.toString(findMissingNumbers(arr)));
	}

	private static int[] findMissingNumbers(int[] arr)
	{
		Arrays.sort(arr);
		int min = arr[0];
		int max = arr[arr.length - 1];

		Set<Integer> setArr = Arrays.stream(arr)
				.boxed()
				.collect(Collectors.toSet());

		return IntStream.rangeClosed(min, max)
				.filter(num -> !setArr.contains(num))
				.toArray();

		/*List<Integer> result = new ArrayList<>();
		
		for(int i = min; i < max; i++)
		{
			if(!setArr.contains(i))
			{
				result.add(i);
			}
		}
		
		return result.stream().mapToInt(Integer::intValue).toArray();*/
	}
}
