package com.org.java;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test
{

	public static void main(String[] args)
	{
		/*
		 * Float f = 3.0f; int x = f.intValue(); byte b = f.byteValue(); double d =
		 * f.doubleValue();
		 * 
		 * System.out.println(x+b+d);
		 */

		/*Scanner s = new Scanner(System.in);
		int N = 0;
		N = s.nextInt();
		
		int[] data = new int[N];
		for(int i = 0; i < N; i++)
		{
			data[i] = s.nextInt();
		}
		
		String str = "";
		for(int j = 0; j < N; j++)
		{
			str += String.valueOf(data[j] % 10);
		}
		
		int result = Integer.parseInt(str);
		
		String ans = "";
		
		if(result % 10 == 0)
		{
			ans = "Yes";
		}
		else
		{
			ans = "No";
		}
		
		System.out.println(ans);
		s.close();*/

		double payment = 145.34d;

		System.out.println(NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(payment));

		List<String> items = Arrays.asList("apple", "apple", "banana",
				"apple", "orange", "banana", "papaya");

		Map<String, Long> itemsMap = items.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("input map: " + itemsMap);

		Map<String, Long> sortedMap = itemsMap.entrySet().stream()
				.sorted((a, b) -> a.getKey().compareTo(b.getKey()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
						(oldValue, newValue) -> oldValue, LinkedHashMap::new));
		System.out.println("sorted map by key: " + sortedMap);

		Map<String, Long> sortedMapByValue = itemsMap.entrySet().stream()
				.sorted(Comparator.comparing(Map.Entry::getValue))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
						(e1, e2) -> e1, LinkedHashMap::new));
		System.out.println("sorted map by value: " + sortedMapByValue);

		// Alternatively

		itemsMap.entrySet().stream()
				.sorted(Entry.comparingByKey())
				.forEach(System.out::println);

		//////////////////////

		Stream.of("one", "two", "three", "four")
				.filter(e -> e.length() > 3)
				.peek(e -> System.out.println("Filtered value: " + e))
				.map(String::toUpperCase)
				.peek(e -> System.out.println("Mapped value: " + e))
				.collect(Collectors.toList());

		List<Integer> il = List.of(1, 2, 3, 4, 5);
		int total = il.parallelStream()
				// .reduce(0, Integer::sum);
				.mapToInt(Integer::intValue)
				.sum();
		System.out.println(total);
	}
}
