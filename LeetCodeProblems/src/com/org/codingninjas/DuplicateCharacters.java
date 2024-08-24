package com.org.codingninjas;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

//https://www.naukri.com/code360/problems/duplicate-characters_3189116?interviewProblemRedirection=true&page=5&difficulty%5B%5D=Easy&leftPanelTabValue=PROBLEM
public class DuplicateCharacters
{
	public static ArrayList<Pair> duplicate_char(String s, int n)
	{
		// Write your Code here
		ArrayList<Pair> pairs = new ArrayList<>();

		/*Map<Character, Long> map = new TreeMap<>();
		map = s.chars()
				.mapToObj(e -> (char) e)
				.collect(Collectors.groupingBy(a -> a, Collectors.counting()));
		
		for(Map.Entry<Character, Long> entry : map.entrySet())
		{
			if(entry.getValue() > 1)
			{
				pairs.add(new Pair(entry.getKey(), entry.getValue().intValue()));
			}
		}*/

		Map<Character, Integer> hashMap = new TreeMap<>();
		for(char ch : s.toCharArray())
		{
			hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
		}

		for(Map.Entry<Character, Integer> entry : hashMap.entrySet())
		{
			if(entry.getValue() > 1)
			{
				pairs.add(new Pair(entry.getKey(), entry.getValue()));
			}
		}

		return pairs;
	}

}

class Pair
{
	char alphabet;
	int count;

	Pair(char ch, int x)
	{
		this.alphabet = ch;
		this.count = x;
	}
}
