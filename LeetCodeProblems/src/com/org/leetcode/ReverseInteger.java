package com.org.leetcode;

public class ReverseInteger
{
	public int reverse(int x)
	{
		String s = String.valueOf(x);

		if(s.contains("-"))
		{
			String[] sarr = s.split("");
			String sr = "";
			for(int i = 1; i < sarr.length; i++)
			{
				sr += sarr[i];
			}
			String srr = reverseString(sr);
			String reversed = sarr[0] + srr;
			return Integer.parseInt(reversed);
		}
		else
		{
			String reversed = reverseString(s);
			return Integer.parseInt(reversed);
		}
	}

	private String reverseString(String str)
	{
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();

		return sb.toString();
	}

}
