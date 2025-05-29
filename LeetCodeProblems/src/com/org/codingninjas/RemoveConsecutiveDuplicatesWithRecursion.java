package com.org.codingninjas;

//https://www.naukri.com/code360/problems/remove-duplicates-recursively_5849?leftPanelTabValue=PROBLEM&count=25&search=&sort_entity=order&sort_order=ASC&customSource=studio_nav&page=1
public class RemoveConsecutiveDuplicatesWithRecursion
{
	public static String removeConsecutiveDuplicates(String str)
	{
		// Write your code here

		if(str == null || str.length() <= 1)
		{
			return str;
		}

		// Check first two characters
		if(str.charAt(0) == str.charAt(1))
		{
			// Skip the first character and recurse
			return removeConsecutiveDuplicates(str.substring(1));
		}
		else
		{
			// Keep the first character and recurse on the rest
			return str.charAt(0) + removeConsecutiveDuplicates(str.substring(1));
		}
	}

	public static void main(String[] args)
	{
		String input = "aaabbccdee";
		String result = removeConsecutiveDuplicates(input);
		System.out.println(result); // Output: abcde
	}

}
