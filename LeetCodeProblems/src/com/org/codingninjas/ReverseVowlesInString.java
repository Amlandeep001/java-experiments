package com.org.codingninjas;

import java.util.Arrays;
import java.util.List;

/**
 * Link: https://www.naukri.com/code360/problems/reverse-vowels-in-a-string_1231000?interviewProblemRedirection=true&search=Reverse%20&attempt_status=COMPLETED
 */
public class ReverseVowlesInString
{
	public static String reverseVowels(String s)
	{
		List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

		char[] ch = s.toCharArray();

		int i = 0, j = s.length() - 1;

		while (i < j)
		{
			if(!vowels.contains(ch[i]))
			{
				i++;
			}
			else if(!vowels.contains(ch[j]))
			{
				j--;
			}
			else
			{
				char tmp = ch[i];
				ch[i] = ch[j];
				ch[j] = tmp;

				i++;
				j--;
			}
		}

		return new String(ch);
	}

	public static void main(String[] args)
	{
		String s = "pperu";
		System.out.println(ReverseVowlesInString.reverseVowels(s));
	}
}
