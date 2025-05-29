package com.org.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//https://leetcode.com/problems/most-common-word/description/?envType=problem-list-v2&envId=array

public class MostCommonWord
{
	public static String mostCommonWord(String paragraph, String[] banned)
	{
		String words = paragraph.toLowerCase().replaceAll("[^a-z]", " ");
		List<String> bannedList = Arrays.asList(banned);

		return Arrays.asList(words.split("\\s+")).stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet()
				.stream()
				.filter(entry -> !bannedList.contains(entry.getKey()))
				.max(Map.Entry.comparingByValue())
				.map(Map.Entry::getKey)
				.get();
	}

	public static void main(String[] args)
	{
		String paragraph = "a, a, a, a, b,b,b,c, c";
		String[] banned = {"a"};

		System.out.println(mostCommonWord(paragraph, banned));
	}

}
