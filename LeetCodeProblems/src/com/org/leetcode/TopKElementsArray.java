package com.org.leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

//https://leetcode.com/problems/top-k-frequent-elements/description/
public class TopKElementsArray
{
	public static int[] topK(int[] nums, int k)
	{
		/*List<Integer> arl = new ArrayList<Integer>();
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
		
		return new int[0];*/

		return Arrays.stream(nums)
				.boxed()
				.collect(Collectors.groupingBy(
						Function.identity(), Collectors.counting()))
				.entrySet()
				.stream()
				.sorted(Entry.comparingByValue(
						Comparator.reverseOrder()))
				.map(entry -> entry.getKey())
				.limit(k)
				.mapToInt(Integer::intValue)
				.toArray();
	}

	public static void main(String[] args)
	{
		int[] arr = {1, 1, 1, 2, 2, 3};
		System.out.println(Arrays.toString(topK(arr, 2)));
	}

}
