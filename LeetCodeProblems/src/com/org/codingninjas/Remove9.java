package com.org.codingninjas;

//https://www.naukri.com/code360/problems/remove-9_1466959?resumeRedirection=true&count=25&page=1&search=&sort_entity=order&sort_order=ASC
public class Remove9
{
	public static int remove9(int n)
	{
		// Write your code here.

		int count = 0;
		int current = 0;

		while (count < n)
		{ // Keep generating numbers until the `N`th valid number
			current++; // Move to the next natural number
			if(!containsNine(current))
			{ // If it doesn't contain '9', it's valid
				count++; // Increment valid count
			}
		}

		return current; // Return the `N`th valid number
	}

	// Helper method to check if a number contains the digit '9'
	private static boolean containsNine(int num)
	{
		while (num > 0)
		{
			if(num % 10 == 9)
			{ // Check if the last digit is 9
				return true;
			}
			num /= 10; // Move to the next digit
		}
		return false;
	}

	public static void main(String[] args)
	{
		System.out.println(remove9(81));
	}
}
