package com.org.codingninjas;

import java.util.HashMap;

//https://www.naukri.com/code360/problems/check-if-two-given-strings-are-isomorphic-to-each-other_1117636?interviewProblemRedirection=true&leftPanelTabValue=PROBLEM&customSource=studio_nav
public class IsomorphicStrings
{
	public static boolean areIsomorphic(String str1, String str2)
	{
		if(str1.length() != str2.length())
		{
			return false; // If strings have different lengths, they cannot be isomorphic
		}

		// Create patterns for both strings
		String pattern1 = createPattern(str1);
		String pattern2 = createPattern(str2);

		// Compare patterns
		return pattern1.equals(pattern2);
	}

	// Helper method to create a pattern for a string
	private static String createPattern(String str)
	{
		HashMap<Character, Integer> map = new HashMap<>();
		StringBuilder pattern = new StringBuilder();

		int count = 0;
		for(char ch : str.toCharArray())
		{
			if(!map.containsKey(ch))
			{
				map.put(ch, count++);
			}
			pattern.append(map.get(ch));
		}

		return pattern.toString();
	}

	public static void main(String[] args)
	{
		String str1 = "aab";
		String str2 = "xxy";

		System.out.println(areIsomorphic(str1, str2));
	}
}
