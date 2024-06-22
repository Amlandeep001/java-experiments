package com.org.various.sources;

public class StringManipulation
{
	public static String countCharacters(String s)
	{
		if(s == null || s.isEmpty())
		{
			return "";
		}

		String result = ""; // Initialize an empty result string
		char currentChar = s.charAt(0); // Start with the first character
		int count = 1; // Initialize the count for the first character

		// Iterate through the string to count consecutive characters
		for(int i = 1; i < s.length(); i++)
		{
			char nextChar = s.charAt(i);
			if(nextChar == currentChar)
			{
				count++; // Increment the count if it's the same character
			}
			else
			{
				// Add the current character and its count to the result string
				result += currentChar + Integer.toString(count);
				currentChar = nextChar; // Update the current character
				count = 1; // Reset the count
			}
		}

		// Add the last character and its count to the result
		result += currentChar + Integer.toString(count);

		return result; // Return the result string
	}

	public static void main(String[] args)
	{
		String s = "AABCAD";
		String result = countCharacters(s);

		System.out.println("Result: " + result); // Expected: "A2B1C1A1D1"
	}
}
