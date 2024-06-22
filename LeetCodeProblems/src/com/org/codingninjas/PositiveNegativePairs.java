package com.org.codingninjas;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

public class PositiveNegativePairs
{
	public static ArrayList<ArrayList<Integer>> pairs(ArrayList<Integer> arr, int n)
	{
		// Write your code here.

		ArrayList<ArrayList<Integer>> listOfPairs = new ArrayList<>();

		for(int i = 0; i < arr.size(); i++)
		{
			for(int j = i + 1; j < arr.size(); j++)
			{
				if(BigDecimal.valueOf(arr.get(i)) == BigDecimal.valueOf(arr.get(j)).negate())
				{
					listOfPairs.add(new ArrayList<>(Arrays.asList(arr.get(i), arr.get(j))));
				}
				else if(BigDecimal.valueOf(arr.get(i)).negate() == BigDecimal.valueOf(arr.get(j)))
				{
					listOfPairs.add(new ArrayList<>(Arrays.asList(arr.get(i), arr.get(j))));
				}
			}
		}
		if(listOfPairs.size() > 0)
		{
			listOfPairs.forEach(l -> l.sort(null));
		}

		return listOfPairs;
	}

	public static void main(String[] args)
	{
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(4, 8, 9, -4, 1, -1, -8, -9));
		System.out.println(pairs(arr, 8));
	}

}
