package com.org.codingninjas;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://www.naukri.com/code360/problems/lexicographic-permutation-rank_1877308?interviewProblemRedirection=true&leftPanelTabValue=PROBLEM&count=25&search=&sort_entity=order&sort_order=ASC&customSource=studio_nav&page=3
public class LexicographicRank
{
	public static long lexicRank(String S)
	{
		// Write your code here

		int n = S.length();

		// Calculate factorials for the range [0, n]
		long[] factorial = new long[n + 1];
		factorial[0] = 1;
		for(int i = 1; i <= n; i++)
		{
			factorial[i] = factorial[i - 1] * i;
		}

		// Create a sorted version of the input string
		char[] sortedArray = S.toCharArray();
		Arrays.sort(sortedArray);

		// Store the positions of the characters
		Map<Character, Integer> positionMap = new HashMap<>();
		for(int i = 0; i < sortedArray.length; i++)
		{
			positionMap.put(sortedArray[i], i);
		}

		long rank = 1; // To keep 1-based index for the rank

		// Calculate the rank
		for(int i = 0; i < n; i++)
		{
			char currentChar = S.charAt(i);

			// Find the number of smaller characters to the left of the current character in the sorted array
			int smallerCount = positionMap.get(currentChar);

			// Increment rank by the number of permutations for smaller characters
			rank += smallerCount * factorial[n - i - 1];

			// Remove the current character from the map and update the positions
			positionMap.remove(currentChar);

			// Update the positions for characters to the right
			for(char key : positionMap.keySet())
			{
				if(positionMap.get(key) > smallerCount)
				{
					positionMap.put(key, positionMap.get(key) - 1);
				}
			}
		}

		return rank;
	}

	public static void main(String[] args)
	{
		String S = "coding";
		System.out.println(lexicRank(S));
	}
}
