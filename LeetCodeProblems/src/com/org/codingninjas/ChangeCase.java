package com.org.codingninjas;

//https://www.naukri.com/code360/problems/change-case_4605105?topList=tcs-interview-questions&problemListRedirection=true&leftPanelTabValue=PROBLEM
public class ChangeCase
{
	public static void changeCase(StringBuffer str)
	{
		// Write your code here.

		for(int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			if(Character.isLowerCase(ch))
			{
				str.setCharAt(i, Character.toUpperCase(ch));
			}
			else
			{
				str.setCharAt(i, Character.toLowerCase(ch));
			}
		}
		System.out.println(str);
	}

	public static void main(String[] args)
	{
		StringBuffer str = new StringBuffer("aBc");
		ChangeCase.changeCase(str);
	}

}
