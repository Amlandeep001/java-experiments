package com.org.codingninjas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://www.codingninjas.com/studio/problems/pair-sum_697295?interviewProblemRedirection=true&leftPanelTabValue=PROBLEM
public class PairSum
{
	public static List<int[]> pairSum(int[] arr, int s)
	{
		/*List<int[]> result = new ArrayList<>();
		Map<Integer, Integer> frequencyMap = new HashMap<>();
		
		for(int num : arr)
		{
			int complement = s - num;
		
			// Check if the complement is in the frequency map
			if(frequencyMap.containsKey(complement))
			{
				int frequency = frequencyMap.get(complement);
		
				// Include all possible pairs
				for(int i = 0; i < frequency; i++)
				{
					int[] pair = {Math.min(num, complement), Math.max(num, complement)};
					result.add(pair);
				}
			}
		
			// Update the frequency map
			frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
		}
		
		return result;*/

		List<int[]> intList = new ArrayList<>();
		int n = arr.length;
		Arrays.sort(arr);

		for(int i = 0; i < n - 1; i++)
		{
			for(int j = i + 1; j < n; j++)
			{
				if(arr[i] + arr[j] == s)
				{
					intList.add(new int[]{arr[i], arr[j]});
				}
			}
		}

		return intList;
	}

	public static void main(String[] args)
	{
		int[] arr = {2, -6, 2, 5, 2};

		PairSum.pairSum(arr, 4).forEach(e -> System.out.println(Arrays.toString(e)));
	}

}
