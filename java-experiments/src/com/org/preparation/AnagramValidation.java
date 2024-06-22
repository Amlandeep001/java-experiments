package com.org.preparation;

import java.util.Arrays;

/**
 * 
 * Validate two given strings are anagram to each other or not. 
 * @author Amlan
 *
 */
public class AnagramValidation
{
	public static void main(String[] args)
	{
		String str1 = "java";
		String str2 = "avaj";

		boolean isAnagram = anagramCheck(str1, str2);

		System.out.println("are the two strings anagram: " + isAnagram);
	}

	private static boolean anagramCheck(String str1, String str2)
	{
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		return Arrays.equals(arr1, arr2);
	}

}
