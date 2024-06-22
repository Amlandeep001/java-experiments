package com.org.codingninjas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateInArray
{
	public static int findDuplicate(ArrayList<Integer> arr, int n)
	{
		// Solution-1
		/*return arr.stream()
				.filter(a -> Collections.frequency(arr, a) > 1)
				.distinct()
				.findFirst()
				.orElse(0);
		*/
		// Solution-2
		return arr.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet()
				.stream()
				.filter(entry -> entry.getValue() > 1)
				.map(Entry::getKey)
				.findFirst()
				.orElse(0);

		/*for(Map.Entry<Integer, Long> entry : map.entrySet())
		{
			if(entry.getValue() > 1)
			{
				return entry.getKey();
			}
		}
		return 0;*/
	}

	public static void main(String[] args)
	{
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 1, 2));
		System.out.println(findDuplicate(arr, 3));
	}

}
