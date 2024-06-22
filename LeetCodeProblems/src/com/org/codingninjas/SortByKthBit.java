package com.org.codingninjas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//https://www.naukri.com/code360/problems/sort-by-kth-bit_973086?interviewProblemRedirection=true&leftPanelTabValue=PROBLEM&count=25&search=&sort_entity=order&sort_order=ASC&customSource=studio_nav&page=2
public class SortByKthBit
{
	public static int[] sortArrayByKBit(int n, int k, int arr[])
	{
		// Write your code here.

		// Predicate to check if the K-th bit is set to 1
		Predicate<Integer> isKBitSet = (num) -> (num / (int) Math.pow(2, k - 1)) % 2 == 1;

		// Convert array to list for stream operations
		List<Integer> list = Arrays.stream(arr)
				.boxed()
				.collect(Collectors.toList());

		// Partition the list into two groups: K-th bit is 0, K-th bit is 1
		Map<Boolean, List<Integer>> partitioned = list.stream()
				.collect(Collectors.partitioningBy(isKBitSet));

		// Extract the sub-lists for elements where the K-th bit is 0 and 1
		List<Integer> zeros = partitioned.get(false);
		List<Integer> ones = partitioned.get(true);

		// Create the final result by concatenating zeros followed by ones
		List<Integer> resultList = new ArrayList<>(zeros);
		resultList.addAll(ones);

		// Convert the result list back to an array
		int[] result = resultList.stream()
				.mapToInt(Integer::intValue)
				.toArray();

		return result;
	}
}
