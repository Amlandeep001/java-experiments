package com.org.various.sources;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
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

		Map<String, Integer> map = fruits.stream()
				.collect(Collectors.toMap(Function.identity(), String::length));

		/*Map<String, Integer> map = fruits.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(String::length)));*/

		System.out.println(map);

		List<String> freshFruits = Arrays.asList("apple", "banana", "apple", "banana", "banana", "orange", "kiwi");

		/*Map<String, Integer> fruitsMap = freshFruits.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(String::length)));*/

		Map<String, Integer> newMap = freshFruits.stream()
				.collect(Collectors.toMap(Function.identity(), String::length, (e1, e2) -> e1, LinkedHashMap::new));

		// System.out.println(fruitsMap);

		System.out.println(newMap);

		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// Group Strings by First Character

		// Input: ["apple", "banana", "avocado", "blueberry"]
		// Output: {a=[apple, avocado], b=[banana, blueberry]}

		List<String> strings = Arrays.asList("apple", "banana", "avocado", "blueberry");

		Map<Character, List<String>> groupedByFirstChar = strings.stream()
				.collect(Collectors.groupingBy(s -> s.charAt(0)));

		System.out.println(groupedByFirstChar);

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

		// Without using sorted() method

		int thirdMax = ints.stream()
				.distinct()
				.collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.reverseOrder())))
				.stream()
				.skip(2)
				.findFirst()
				.orElseThrow(() -> new RuntimeException("number not present"));

		System.out.println(thirdMax);

		// Maximum number

		int highest = ints.stream()
				.distinct()
				.max(Comparator.naturalOrder())
				.orElseThrow(() -> new RuntimeException("number not present"));

		System.out.println(highest);

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

		System.out.println(sb.reverse());

		/////////////////////////////////////////////////////////////////////////////////////

		List<Integer> list = Arrays.asList(1, 2, 2, 2, 3, 3, 4, 5, 1, 1, 56, 7, 8, 9, 10);

		List<Integer> dups = list.stream()
				.filter(e -> Collections.frequency(list, e) > 1)
				.distinct()
				.toList();

		System.out.println("Duplicates: " + dups);

		/////////////////////////////////////////////////////////////////////////////////////

		String abc = "committee";

		/*List<String> list = Arrays.asList(abc.split(""));
		
		Map<String, Long> mapCount = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		mapCount.forEach((k, v) -> System.out.println(k + " : " + v));*/

		abc.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.forEach((k, v) -> System.out.println(k + " : " + v));
	}

}
