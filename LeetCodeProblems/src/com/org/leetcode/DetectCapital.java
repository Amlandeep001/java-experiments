package com.org.leetcode;

//https://leetcode.com/problems/detect-capital/description/
public class DetectCapital
{
	public static boolean detectCapitalUse(String word)
	{
		if(word.toUpperCase().equals(word) || word.toLowerCase().equals(word))
		{
			return true;
		}
		else if(word.substring(0, 1).toUpperCase().equals(word.substring(0, 1)))
		{
			if(word.length() > 1)
			{
				if(word.substring(1).toLowerCase().equals(word.substring(1)))
				{
					return true;
				}

				return false;
			}
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args)
	{
		String word = "USA";
		System.out.println(detectCapitalUse(word));
	}

}
