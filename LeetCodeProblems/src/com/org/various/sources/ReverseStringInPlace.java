package com.org.various.sources;

public class ReverseStringInPlace
{
	public static void main(String[] args)
	{
		String s = "ABCD";

		char[] ch = s.toCharArray();
		System.out.println(ch);

		int left = 0;
		int right = ch.length - 1;

		while (left < right)
		{
			char temp = ch[left];
			ch[left] = ch[right];
			ch[right] = temp;

			left++;
			right--;
		}

		System.out.println(ch);
	}

}
