package com.org.codingninjas;

import java.util.Arrays;
import java.util.List;

public class RemoveVowels
{
	public static String removeVowels(String str)
	{
		// Write your code here.

		List<Character> ch = Arrays.asList('a', 'e', 'i', 'o', 'u',
				'A', 'E', 'I', 'O', 'U');

		/*return str.chars()
				.filter(e -> !ch.contains((char) e))
				.mapToObj(i -> "" + (char) i)
				.collect(Collectors.joining());*/

		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < str.length(); i++)
		{
			if(!ch.contains(str.charAt(i)))
			{
				builder.append(str.charAt(i));
			}
		}
		return builder.toString();
	}
}
