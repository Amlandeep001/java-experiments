package com.org.geeksforgeeks;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//https://www.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/1
public class ReverseWords
{
	static String reverseWords(String str)
	{
		// code here

		List<String> list = Arrays.asList(str.split("\\."));

		Collections.reverse(list);

		return list.stream()
				.collect(Collectors.joining("."));
	}

	public static void main(String[] args)
	{
		String str = "i.like.this.program.very.much";
		System.out.println(reverseWords(str));
	}
}
