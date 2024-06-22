package com.org.codingninjas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DupliactesInArray
{
	public static ArrayList<Integer> findDuplicates(int[] arr, int n)
	{
		// Write your code here.

		List<Integer> arrList = Arrays.stream(arr).boxed().collect(Collectors.toList());

		/*return (ArrayList<Integer>) arrList.stream()
				.filter(e -> Collections.frequency(arrList, e) > 1)
				.distinct()
				.collect(Collectors.toList());*/
		Set<Integer> set = arrList.stream()
				.filter(e -> Collections.frequency(arrList, e) > 1)
				.collect(Collectors.toSet());
		return new ArrayList<>(set);
	}

	public static void main(String[] args)
	{
		int[] arr = {3, 2, 1, 3, 2, 1, 5};
		System.out.println(findDuplicates(arr, 7));
	}

}
