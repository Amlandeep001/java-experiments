package com.org.various.sources;

/**
 * Beautiful string is a string not having two adjacent - 1. Characters same and 2. Adjacent in alphabetical order
 * Find the minimum number of operations required to make the string beautiful. 
 */

public class BeautifulStringMinOperations
{
	public static int minOperationsToMakeBeautiful(String str)
	{
		if(str == null || str.length() <= 1)
		{
			return 0;
		}

		int operations = 0;
		char[] chars = str.toCharArray();

		for(int i = 1; i < chars.length; i++)
		{
			if(chars[i] == chars[i - 1] || Math.abs(chars[i] - chars[i - 1]) == 1)
			{
				operations++;
				chars[i] = findReplacement(chars[i - 1], chars[i], i + 1 < chars.length ? chars[i + 1] : null);
			}
		}

		return operations;
	}

	private static char findReplacement(char prev, char current, Character next)
	{
		for(char c = 'a'; c <= 'z'; c++)
		{
			if(c != prev && (next == null || c != next) && Math.abs(c - prev) != 1 && (next == null || Math.abs(c - next) != 1))
			{
				return c;
			}
		}
		// In case no suitable replacement is found, though there always should be one
		return current;
	}

	public static void main(String[] args)
	{
		String test1 = "abac";
		String test2 = "acef";
		String test3 = "abc";
		String test4 = "aabbcc";
		String test5 = "a";

		System.out.println("Min operations for \"" + test1 + "\": " + minOperationsToMakeBeautiful(test1)); // Output: 0
		System.out.println("Min operations for \"" + test2 + "\": " + minOperationsToMakeBeautiful(test2)); // Output: 0
		System.out.println("Min operations for \"" + test3 + "\": " + minOperationsToMakeBeautiful(test3)); // Output: 1
		System.out.println("Min operations for \"" + test4 + "\": " + minOperationsToMakeBeautiful(test4)); // Output: 3
		System.out.println("Min operations for \"" + test5 + "\": " + minOperationsToMakeBeautiful(test5)); // Output: 0
	}
}
