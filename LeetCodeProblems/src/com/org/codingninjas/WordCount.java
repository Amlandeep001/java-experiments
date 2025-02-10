package com.org.codingninjas;

import java.util.Arrays;

public class WordCount
{
	static int countWords(String input)
	{
		// Write your code here

		return (int) Arrays.asList(input.split(" "))
				.stream().count();
	}

	public static void main(String[] args)
	{
		String s = "I am a boy";
		System.out.println(countWords(s));
	}
}
