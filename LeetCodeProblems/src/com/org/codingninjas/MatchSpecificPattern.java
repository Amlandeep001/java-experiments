package com.org.codingninjas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//https://www.codingninjas.com/studio/problems/match-specific-pattern_981301?interviewProblemRedirection=true&leftPanelTabValue=PROBLEM&customSource=studio_nav
public class MatchSpecificPattern
{

	public static List<String> findMatchingWords(List<String> words, String pattern)
	{
		return words.stream()
				.filter(word -> matchesPattern(word, pattern))
				.collect(Collectors.toList());
	}

	private static boolean matchesPattern(String word, String pattern)
	{
		if(word.length() != pattern.length())
		{
			return false;
		}

		Map<Character, Character> map = new HashMap<>();

		for(int i = 0; i < word.length(); i++)
		{
			char wChar = word.charAt(i);
			char pChar = pattern.charAt(i);

			if(map.containsKey(pChar))
			{
				if(map.get(pChar) != wChar)
				{
					return false;
				}
			}
			else
			{
				if(map.containsValue(wChar))
				{
					return false;
				}
				map.put(pChar, wChar);
			}
		}

		return true;
	}

	public static void main(String[] args)
	{
		List<String> words = new ArrayList<>();
		words.add("cod");
		words.add("zcz");

		String pattern = "nin";

		List<String> matchingWords = findMatchingWords(words, pattern);
		System.out.println("Words matching pattern '" + pattern + "': " + matchingWords);
	}
}