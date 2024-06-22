package com.org.codingninjas;

//https://www.naukri.com/code360/problems/beautiful-string_1115625?interviewProblemRedirection=true&search=beautiful%20string&attempt_status=COMPLETED&leftPanelTabValue=PROBLEM
public class BeautifulString
{
	public static int makeBeautiful(String str)
	{
		return Math.min(getFlipWithStartingCharcter(str, '0'),
				getFlipWithStartingCharcter(str, '1'));
	}

	public static char flip(char ch)
	{
		return (ch == '0') ? '1' : '0';
	}

	// Utility method to get minimum flips when
	// alternate string starts with expected char
	public static int getFlipWithStartingCharcter(String str, char expected)
	{
		int flipCount = 0;
		for(int i = 0; i < str.length(); i++)
		{
			// if current character is not expected,
			// increase flip count
			if(str.charAt(i) != expected)
				flipCount++;

			// flip expected character each time
			expected = flip(expected);
		}
		return flipCount;
	}
}
