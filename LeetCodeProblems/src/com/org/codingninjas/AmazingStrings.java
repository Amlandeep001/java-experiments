package com.org.codingninjas;

import java.util.Arrays;

//https://www.naukri.com/code360/problems/amazing-strings_647?interviewProblemRedirection=true&leftPanelTabValue=PROBLEM&count=25&search=&sort_entity=order&sort_order=ASC&customSource=studio_nav&page=5&difficulty%5B%5D=Easy
public class AmazingStrings
{
	public static void answer(String s1, String s2, String s3)
	{
		// Write your code here
		String s = s1.concat(s2);
		char[] ch = s.toCharArray();
		char[] ch3 = s3.toCharArray();

		Arrays.sort(ch);
		Arrays.sort(ch3);

		if(Arrays.equals(ch, ch3))
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}

	public static void main(String[] args)
	{
		String s1 = "PAPAINOEL";
		String s2 = "JOULUPUKKI";
		String s3 = "JOULNAPAOILELUPUKKI";

		AmazingStrings.answer(s1, s2, s3);
	}
}
