package com.org.codingninjas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//https://www.naukri.com/code360/problems/sorting-characters-by-frequency_1263699?interviewProblemRedirection=true&search=Sorting&attempt_status=COMPLETED&leftPanelTabValue=PROBLEM&count=25&page=1&sort_entity=order&sort_order=ASC&customSource=studio_nav
public class SortingCharactersByFrequency
{
	public static String sortByFrequency(int n, String s)
	{
		// Write Your Code here

		/*Map<Character, Integer> frequencyMap = new HashMap<>();
		for(char c : s.toCharArray())
		{
			frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
		}
		
		System.out.println(frequencyMap);
		
		// Step 2: Create a list of characters
		List<Character> characters = new ArrayList<>(frequencyMap.keySet());
		
		System.out.println(characters);
		
		// Step 3: Sort the list based on frequency
		characters.sort((a, b) -> frequencyMap.get(b).compareTo(frequencyMap.get(a)));
		
		// Step 4: Build the result string
		StringBuilder result = new StringBuilder();
		for(char c : characters)
		{
			int count = frequencyMap.get(c);
			for(int i = 0; i < count; i++)
			{
				result.append(c);
			}
		}
		
		return result.toString();*/

		List<String> list = Arrays.asList(s.split(""));

		Map<String, Long> frequencyMap = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
						(e1, e2) -> e1, LinkedHashMap::new));

		List<String> sorted = new ArrayList<>(frequencyMap.keySet());

		StringBuilder res = new StringBuilder();
		for(String str : sorted)
		{
			long count = frequencyMap.get(str);
			for(long i = 0; i < count; i++)
			{
				res.append(str);
			}
		}
		return res.toString();
	}

	public static void main(String[] args)
	{
		String s = "abAb";
		System.out.println(sortByFrequency(4, s));
	}
}
