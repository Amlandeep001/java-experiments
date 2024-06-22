package com.org.various.sources;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 	Given two arrays of Strings , determine corresponding elements contain a common substring. 
	Example: 
	a= [‘ab’, ‘cd’, ‘ef’]
	b=[‘af’, ‘ee’, ‘ef’]

	Print YES for common and NO for nothing.

	Answer: YES, NO, YES
 */
public class CommonSubstring
{
	public static void checkCommonSubstring(List<String> a, List<String> b)
	{
		for(int i = 0; i < a.size(); i++)
		{
			if(hasCommonSubstring(a.get(i), b.get(i)))
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
	}

	private static boolean hasCommonSubstring(String s1, String s2)
	{
		Set<Character> set1 = new HashSet<>();
		for(char c : s1.toCharArray())
		{
			set1.add(c);
		}

		for(char c : s2.toCharArray())
		{
			if(set1.contains(c))
			{
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args)
	{
		List<String> a = Arrays.asList("ab", "cd", "ef");
		List<String> b = Arrays.asList("af", "ee", "ef");

		checkCommonSubstring(a, b);
	}
}
