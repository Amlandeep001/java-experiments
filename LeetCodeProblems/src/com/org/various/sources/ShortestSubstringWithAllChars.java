package com.org.various.sources;

import java.util.HashMap;
import java.util.Map;

public class ShortestSubstringWithAllChars
{
	public static String shortestSubstring(String input1, String input2)
	{
		if(input1.isEmpty() || input2.isEmpty())
		{
			return "";
		}

		// Create a frequency map for the target characters from input2
		Map<Character, Integer> targetFreq = new HashMap<>();
		for(char c : input2.toCharArray())
		{
			targetFreq.put(c, targetFreq.getOrDefault(c, 0) + 1);
		}

		int required = targetFreq.size(); // Number of unique characters to find
		int formed = 0; // Track how many unique characters are in the current window

		Map<Character, Integer> windowFreq = new HashMap<>();
		int left = 0;
		int minLength = Integer.MAX_VALUE;
		int minStart = 0;

		for(int right = 0; right < input1.length(); right++)
		{
			char current = input1.charAt(right);
			windowFreq.put(current, windowFreq.getOrDefault(current, 0) + 1);

			// If current character completes a required character count
			if(targetFreq.containsKey(current) && windowFreq.get(current).intValue() == targetFreq.get(current).intValue())
			{
				formed++;
			}

			// Contract the window when all characters are found
			while (formed == required)
			{
				if(right - left + 1 < minLength)
				{
					minLength = right - left + 1;
					minStart = left;
				}

				char leftChar = input1.charAt(left);
				windowFreq.put(leftChar, windowFreq.get(leftChar) - 1);

				if(targetFreq.containsKey(leftChar) && windowFreq.get(leftChar) < targetFreq.get(leftChar))
				{
					formed--;
				}

				left++; // Move the left boundary to contract the window
			}
		}

		return minLength == Integer.MAX_VALUE ? "" : input1.substring(minStart, minStart + minLength);
	}

	public static void main(String[] args)
	{
		String input1 = "My Name is Fran";
		String input2 = "rim";

		String result = shortestSubstring(input1, input2);
		System.out.println("Shortest substring containing all characters: " + result); // Output: "me is Fr"
	}
}
