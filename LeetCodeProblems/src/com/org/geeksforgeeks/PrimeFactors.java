package com.org.geeksforgeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeFactors
{
	public static int[] AllPrimeFactors(int N)
	{
		// code here

		List<Integer> list = new ArrayList<>();

		for(int i = 2; i <= N; i++)
		{
			while (N % i == 0)
			{
				list.add(i);
				N = N / i;
			}
		}

		return list.stream()
				.distinct()
				.sorted()
				.mapToInt(i -> i)
				.toArray();
	}

	public static void main(String[] args)
	{
		System.out.println(Arrays.toString(PrimeFactors.AllPrimeFactors(1)));
	}
}
