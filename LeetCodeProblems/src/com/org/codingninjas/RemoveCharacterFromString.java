package com.org.codingninjas;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//https://www.codingninjas.com/studio/problems/remove-character_1263701?interviewProblemRedirection=true&leftPanelTabValue=PROBLEM

public class RemoveCharacterFromString
{
	static String removeAllOccurrencesOfChar(String input, char c)
	{
		// Write your code here

		// Approach : 1
		/*String s = "";
		
		if(input.contains(String.valueOf(c)))
		{
			for(int i = 0; i < input.length(); i++)
			{
				if(input.charAt(i) != c)
				{
					s += input.charAt(i);
				}
			}
			return s;
		}
		
		return input;*/

		// Approach: 2

		List<String> list = Arrays.asList(input.split(""));

		return list.stream()
				.filter(e -> !e.equals(String.valueOf(c)))
				.collect(Collectors.joining());
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		char c = sc.next().charAt(0);
		String ans = removeAllOccurrencesOfChar(input, c);
		System.out.println(ans);
		sc.close();
	}
}
