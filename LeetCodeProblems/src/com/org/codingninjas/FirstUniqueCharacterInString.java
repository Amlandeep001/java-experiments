package com.org.codingninjas;

//https://www.codingninjas.com/studio/problems/first-unique-character-in-a-string_983606?interviewProblemRedirection=true&leftPanelTabValue=PROBLEM
public class FirstUniqueCharacterInString
{
	public static char firstNonRepeating(String str)
	{
		// Write your code here

		for(char ch : str.toCharArray())
		{
			if(str.indexOf(ch) == str.lastIndexOf(ch))
			{
				return ch;
			}
		}
		return '#';
	}

	public static void main(String[] args)
	{
		String s = "abcab";
		System.out.println(FirstUniqueCharacterInString.firstNonRepeating(s));
	}
}
