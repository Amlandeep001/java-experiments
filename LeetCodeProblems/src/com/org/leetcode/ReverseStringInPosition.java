package com.org.leetcode;

import java.util.Arrays;

//https://leetcode.com/problems/reverse-string/description/
public class ReverseStringInPosition
{
	public static void reverseString(char[] s)
	{
		int len = s.length;

		if(len == 0)
			return;

		for(int i = 0; i < (len / 2); i++)
		{
			char l = s[i];
			s[i] = s[len - i - 1];
			s[len - i - 1] = l;
		}

		System.out.println(Arrays.toString(s));
	}

	public static void main(String[] args)
	{
		char[] s = {'h', 'e', 'l', 'l', 'o'};
		ReverseStringInPosition.reverseString(s);
	}
}
