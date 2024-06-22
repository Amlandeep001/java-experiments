package com.org.codingninjas;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

//https://www.codingninjas.com/studio/problems/missing-number_4606074
public class OneOddOccuring
{

	public static int missingNumber(int n, int[] arr)
	{
		// Write your code here.

		/*List<Integer> al = Arrays.stream(arr)
				.boxed()
				.collect(Collectors.toList());
		
		return al.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet()
				.stream()
				.filter(e -> e.getValue() % 2 != 0)
				.findFirst()
				.get()
				.getKey();*/

		return Arrays.stream(arr)
				.boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet()
				.stream()
				.filter(e -> e.getValue() % 2 != 0)
				.findFirst()
				.get()
				.getKey();
	}

	public static void main(String[] args)
	{
		int[] arr = {1, 2, 3, 2, 3};
		System.out.println(OneOddOccuring.missingNumber(5, arr));
	}
}
