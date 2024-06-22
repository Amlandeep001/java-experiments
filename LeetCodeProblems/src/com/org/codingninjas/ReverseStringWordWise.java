package com.org.codingninjas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReverseStringWordWise
{
	static String reverseStringWordWise(String input)
	{
		// Write your code here

		List<String> strList = Arrays.asList(input.split(" "));
		Collections.reverse(strList);

		return strList.stream()
				.collect(Collectors.joining(" "));
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String ans = reverseStringWordWise(input);
		System.out.println(ans);
		sc.close();
	}
}
