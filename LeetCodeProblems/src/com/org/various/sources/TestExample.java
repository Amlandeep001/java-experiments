package com.org.various.sources;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Interview questions
 */
public class TestExample
{
	public static void main(String[] args)
	{
		List<String> fruits = Arrays.asList("apple", "banana");

		/*Map<String, Integer> map = fruits.stream()
				.collect(Collectors.toMap(Function.identity(), String::length));*/

		Map<String, Integer> map = fruits.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(String::length)));

		System.out.println(map);

		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		List<Integer> ints = Arrays.asList(1, 1, 2, 3, 3, 4, 4);

		int second = ints.stream()
				.distinct()
				.sorted(Comparator.reverseOrder())
				.limit(2)
				.skip(1)
				.findFirst()
				.orElseThrow(() -> new RuntimeException("number not present"));

		System.out.println(second);

		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		List<String> words = Arrays.asList("tower", "power", "shower");

		words.sort(null);

		String min = words.get(0);
		String max = words.get(words.size() - 1);

		StringBuilder sb = new StringBuilder();

		for(int i = min.length() - 1; i >= 0; i--)
		{
			if(min.charAt(i) != max.charAt(i))
			{
				break;
			}
			sb.append(min.charAt(i));
		}

		System.out.println(sb.reverse().toString());
	}

}
