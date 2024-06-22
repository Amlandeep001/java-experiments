package com.org.codingninjas;

//https://www.codingninjas.com/studio/problems/remove-consecutive-duplicates_893195?interviewProblemRedirection=true&leftPanelTabValue=PROBLEM
public class RemoveConsecutiveDuplicates
{
	public static String removeConsecutiveDuplicates(String s)
	{
		// Write your code here

		int length = s.length();
		String res = "";

		for(int i = 0; i < length - 1; i++)
		{
			if(s.charAt(i) != s.charAt(i + 1))
			{
				res += s.charAt(i);
			}
		}

		res += s.charAt(length - 1);

		return res;
	}

	public static void main(String[] args)
	{
		System.out.println(RemoveConsecutiveDuplicates.removeConsecutiveDuplicates("aaaaa"));
	}

}
