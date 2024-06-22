package com.org.codingninjas;

import java.util.ArrayList;
import java.util.List;

public class ArrayRearrangement
{
	public static int[] separateNegativeAndPositive(int a[])
	{
		List<Integer> negatives = new ArrayList<>();
		List<Integer> positives = new ArrayList<>();

		for(int i = 0; i < a.length; i++)
		{
			if(a[i] < 0)
			{
				negatives.add(a[i]);
			}
			else
			{
				positives.add(a[i]);
			}
		}

		negatives.addAll(positives);

		return negatives.stream()
				.mapToInt(Integer::intValue)
				.toArray();

		/*int size = negatives.size();
		int[] result = new int[size];
		Integer[] temp = negatives.toArray(new Integer[size]);
		for(int n = 0; n < size; ++n)
		{
			result[n] = temp[n];
		}
		
		return result;*/
	}

}
