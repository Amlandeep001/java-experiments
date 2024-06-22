package com.org.hackerrank;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//https://www.hackerrank.com/challenges/java-string-tokens/problem?isFullScreen=true
/**
 * sample input = "He is a very very good boy, isn't he?"
 */
public class StringTokens
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		List<String> strings = Arrays.asList(s.split("[^A-Za-z]"));

		System.out.println(strings.toString());

		List<String> formattedStrings = strings.stream()
				.filter(w -> !w.chars().allMatch(Character::isWhitespace))
				.collect(Collectors.toList());

		System.out.println(formattedStrings.size());
		formattedStrings.forEach(System.out::println);

		scan.close();
	}

}
