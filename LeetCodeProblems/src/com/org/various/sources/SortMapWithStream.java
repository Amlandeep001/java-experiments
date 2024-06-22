package com.org.various.sources;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapWithStream
{
	public static void main(String[] args)
	{
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("Amlan", 35);
		hashMap.put("Gaurav", 30);
		hashMap.put("Rajesh", 29);
		hashMap.put("Amit", 34);
		hashMap.put("Abhay", 33);
		hashMap.put("Akriti", 25);

		System.out.println("Employee Map Unsorted: " + hashMap);

		Map<String, Integer> sortedMap = hashMap.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
						(e1, e2) -> e1, LinkedHashMap::new));

		System.out.println("Employee Map Sorted in reversed order on age: " + sortedMap);
	}
}
