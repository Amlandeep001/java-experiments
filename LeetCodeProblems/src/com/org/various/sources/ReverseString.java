package com.org.various.sources;

public class ReverseString
{
	public static void main(String[] args)
	{
		String str = "boy";
		System.out.println(reverseString(str));
	}

	private static char[] reverseString(String str)
	{
		char[] ch = str.toCharArray();

		int left = 0;
		int right = ch.length - 1;

		while (left < right)
		{
			char tmp = ch[left];
			ch[left] = ch[right];
			ch[right] = tmp;

			left++;
			right--;
		}

		return ch;
	}

}
