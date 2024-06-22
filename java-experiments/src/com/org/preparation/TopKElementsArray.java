package com.org.preparation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

//https://www.geeksforgeeks.org/find-k-numbers-occurrences-given-array/
public class TopKElementsArray
{
	public int[] topK(int[] nums, int k)
	{
		List<Integer> arl = new ArrayList<Integer>();
		for(int i : nums)
		{
			arl.add(i);
			System.out.println("Arraylist contains:" + arl.get(0));
		}

		Map<Object, Long> numsMap = arl.stream()
				.collect(Collectors.groupingBy(w -> w, Collectors.counting()));

		Map<Object, Long> sortedMap = numsMap.entrySet().stream()
				.sorted(Entry.comparingByValue(Comparator.reverseOrder()))
				.limit(k)
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		return new int[0];
	}

}
