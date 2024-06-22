package com.org.codingninjas;

import java.util.stream.IntStream;

public class MetaStrings
{
	public static boolean checkMeta(String str1, String str2)
	{
		// If strings are equal, they are not meta strings
		if(str1.equals(str2))
		{
			return false;
		}

		// Convert strings to IntStream of indices where characters differ
		int[] diffIndices = IntStream.range(0, str1.length())
				.filter(i -> str1.charAt(i) != str2.charAt(i))
				.toArray();

		// Count the number of differing characters
		long count = diffIndices.length;

		// If there are not exactly two differing characters, return false
		if(count != 2)
		{
			return false;
		}

		// Check if characters at differing positions are different in each string
		return str1.charAt(diffIndices[0]) == str2.charAt(diffIndices[1]) &&
				str1.charAt(diffIndices[1]) == str2.charAt(diffIndices[0]);
	}

	public static void main(String[] args)
	{
		String str1 = "Coding";
		String str2 = "Codnig";

		System.out.println(checkMeta(str1, str2));
	}
}
