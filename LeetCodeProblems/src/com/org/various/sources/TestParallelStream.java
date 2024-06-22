package com.org.various.sources;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestParallelStream
{
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

		int total = list.parallelStream()
				.mapToInt(Integer::intValue)
				.sum();
		System.out.println("Total with sum() : " + total);

		int totalReduce = list.parallelStream()
				.reduce(0, Integer::sum);

		System.out.println("Total with reduce() : " + totalReduce);

		Map<String, Integer> map = new HashMap<>();
		map.put("ABC", 1);
		map.put("CDB", 2);
		map.put("DBA", 3);
		map.put("XYZ", 4);
		map.put("KYC", 5);

		System.out.println(map);

		Map<String, Integer> sortedMap = map.entrySet().stream()
				.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
						(e1, e2) -> e1, LinkedHashMap::new));

		System.out.println(sortedMap);
	}
}
