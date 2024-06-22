package com.org.java;

import java.util.Arrays;
import java.util.Collections;

public class Solution
{

	public static void main(String[] args)
	{
		char[] s = {'h', 'e', 'l', 'l', 'o'};

		reverseString(s);
	}

	public static void reverseString(char[] s)
	{
		Collections.reverse(Arrays.asList(s));

		System.out.println(Arrays.toString(s));
	}

}
