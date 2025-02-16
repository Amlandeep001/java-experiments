package com.org.leetcode;

/**
 * @author Amlan
 * Link: https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
 */
public class FindNextGreaterLetter
{
	public static char nextGreatestLetter(char[] letters, char target)
	{
		for(int i = 0; i < letters.length; i++)
		{
			if(target < letters[i])
			{
				return letters[i];
			}
		}

		return letters[0];
	}

	public static void main(String[] args)
	{
		char[] letters = {'c', 'f', 'j'};
		System.out.println(nextGreatestLetter(letters, 'a'));
	}
}
