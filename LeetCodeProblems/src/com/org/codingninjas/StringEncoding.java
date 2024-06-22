package com.org.codingninjas;

//https://www.codingninjas.com/studio/problems/encode-the-message_699836?interviewProblemRedirection=true&leftPanelTabValue=PROBLEM
public class StringEncoding
{
	public static String encode(String message)
	{
		// Write your code here.

		int n = message.length();
		StringBuffer sb = new StringBuffer();

		for(int i = 0; i < n; i++)
		{
			int count = 1;

			while (i < n - 1 && message.charAt(i) == message.charAt(i + 1))
			{
				count++;
				i++;
			}

			sb.append(message.charAt(i));
			sb.append(count);
		}

		return sb.toString();
	}

	public static void main(String[] args)
	{
		System.out.println(StringEncoding.encode("aaaabbbccdaa"));
	}
}
