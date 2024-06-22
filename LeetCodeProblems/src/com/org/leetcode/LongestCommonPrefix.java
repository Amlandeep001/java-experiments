package com.org.leetcode;

import java.util.Arrays;

//https://leetcode.com/problems/longest-common-prefix/
public class LongestCommonPrefix
{
	public String longestCommonPrefix(String[] strs)
	{
		/*StringBuilder result = new StringBuilder();
		
		Arrays.sort(strs);
		
		char[] first = strs[0].toCharArray();
		char[] last = strs[strs.length - 1].toCharArray();
		
		for(int i = 0; i < first.length; i++)
		{
			if(first[i] != last[i])
			{
				break;
			}
			result.append(first[i]);
		}
		return result.toString();*/

		Arrays.sort(strs);
		String result = "";

		String first = strs[0], last = strs[strs.length - 1];

		for(int i = 0; i < first.length(); i++)
		{
			if(first.charAt(i) != last.charAt(i))
			{
				break;
			}
			result += first.charAt(i);
		}
		return result;
	}

	public static void main(String[] args)
	{
		String[] s1 = {"flower", "flow", "flowership"};
		LongestCommonPrefix abc = new LongestCommonPrefix();
		System.out.println(abc.longestCommonPrefix(s1));
	}
}
