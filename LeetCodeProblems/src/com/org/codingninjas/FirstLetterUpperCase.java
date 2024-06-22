package com.org.codingninjas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FirstLetterUpperCase
{
	public static String convertString(String str)
	{
		// Write your code here
		List<String> strings = Arrays.asList(str.split(" "));

		return strings.stream()
				.map(w -> Character.toUpperCase(w.charAt(0)) + w.substring(1))
				.collect(Collectors.joining(" "));
	}

}
