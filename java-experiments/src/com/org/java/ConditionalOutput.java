package com.org.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 
 * @author Amlan
 * majority elements in an array when number of elements is "n"
 * majority is decided which is more than n/2
 */
public class ConditionalOutput
{

	public static void main(String[] args)
	{
		int input1 = 4;
		int[] input2 = {1, 2, 1, 2};

		System.out.println(majority(input1, input2));
		System.out.println(majorityWithStream(input1, input2));
	}

	private static int majority(int input1, int input2[])
	{
		Map<Integer, Integer> map = new HashMap<>();

		/*for(int i : input2)
		{
			if(map.containsKey(i))
			{
				map.put(i, map.get(i) + 1);
			}
			else
			{
				map.put(i, 1);
			}
		}
		for(Map.Entry<Integer, Integer> entry : map.entrySet())
		{
			if(entry.getValue() > input1 / 2)
			{
				return entry.getKey();
			}
		}*/

		for(int i : input2)
		{
			map.put(i, map.getOrDefault(i, 0) + 1);
		}

		for(Map.Entry<Integer, Integer> entry : map.entrySet())
		{
			if(entry.getValue() > input1 / 2)
			{
				return entry.getKey();
			}
		}

		return -1;
	}

	private static int majorityWithStream(int input1, int[] input2)
	{
		return Arrays.stream(input2)
				.boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet()
				.stream()
				.filter(entry -> entry.getValue() > input1 / 2)
				.findFirst()
				.map(e -> e.getKey())
				.orElse(-1);
	}
}
