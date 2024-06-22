package com.org.preparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AnagramCount
{
	public static void main(String[] args)
	{
		AnagramCount anagram = new AnagramCount();
		List<String> dictionary = Arrays.asList("heater", "cold", "clod", "reheat", "docl");
		List<String> query = Arrays.asList("codl", "heater", "abcd");
		System.out.println(anagram.stringAnagram(dictionary, query));
	}

	private List<Integer> stringAnagram(List<String> dictionary, List<String> query)
	{
		List<Integer> answer = new ArrayList<>();
		List<String> sortedDictionary = new ArrayList<>();

		dictionary.forEach(dict ->
		{
			char dictArray[] = dict.toCharArray();
			Arrays.sort(dictArray);
			String sortedDict = new String(dictArray);
			sortedDictionary.add(sortedDict);
		});

		query.forEach(qr ->
		{
			char tempArray[] = qr.toCharArray();
			Arrays.sort(tempArray);
			String sortedQr = new String(tempArray);

			int count = Collections.frequency(sortedDictionary, sortedQr);
			answer.add(count);
		});

		return answer;
	}
}
