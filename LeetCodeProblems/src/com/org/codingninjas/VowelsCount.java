package com.org.codingninjas;

import java.util.Arrays;
import java.util.List;

//https://www.codingninjas.com/studio/problems/split-string_3744737?interviewProblemRedirection=true&leftPanelTabValue=PROBLEM
public class VowelsCount
{
	public static Boolean splitString(String str)
	{
		// Write your code here..
		List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
		int mid = str.length() / 2;
		String firstPart = str.substring(0, mid);
		String secondPart = str.substring(mid);

		long firstCount = firstPart.chars()
				.filter(c -> vowels.contains((char) c))
				.count();
		long secondCount = secondPart.chars()
				.filter(d -> vowels.contains((char) d))
				.count();

		if(firstCount == secondCount)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args)
	{
		String str = "AbbaaA";

		System.out.println(VowelsCount.splitString(str));
	}
}
