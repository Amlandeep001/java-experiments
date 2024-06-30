package com.org.various.sources;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NewInterviewProblems
{
	public static void main(String[] args)
	{
		// 1:
		String input = "AABBAAC";
		manipulateString(input);

		// 2:
		List<Integer> list = Arrays.asList(1, 66, 88, 99, 100);
		secondLargestNumber(list);

		String str = "000012345";
		removeZeros(str);
	}

	private static void manipulateString(String input)
	{
		String result = "";
		char currentChar = input.charAt(0);
		int count = 1;

		for(int i = 1; i < input.length(); i++)
		{
			char nextChar = input.charAt(i);

			if(nextChar == currentChar)
			{
				count++;
			}
			else
			{
				result += currentChar + Integer.toString(count);
				currentChar = nextChar;
				count = 1;
			}
		}
		result += currentChar + Integer.toString(count);
		System.out.println(result); // output: A2B2A2C1
	}

	private static void secondLargestNumber(List<Integer> list)
	{
		int secondLargest = list.stream()
				.sorted()
				.skip(1)
				.findFirst()
				.get();
		System.out.println(secondLargest); // output : 99
	}

	private static void removeZeros(String str)
	{
		List<String> strings = Arrays.asList(str.split(""));

		Map<Boolean, List<String>> map = strings.stream()
				.collect(Collectors.partitioningBy(s -> s.equals("0")));

		List<String> listWithoutZeros = map.get(false);
		System.out.println(listWithoutZeros.stream().collect(Collectors.joining())); // output : 12345
	}
}
