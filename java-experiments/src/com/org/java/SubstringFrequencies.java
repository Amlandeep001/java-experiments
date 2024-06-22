package com.org.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SubstringFrequencies
{
	public static int getSubtringFrequncies(String s, int maxLetters, int minLength, int maxLength)
	{
		List<String> subs = new ArrayList<>();

		int maxOccurence = 0;

		for(int i = 0; i < s.length(); i++)
		{
			for(int j = i + 1; j <= s.length(); j++)
			{
				subs.add(s.substring(i, j));
			}
		}

		System.out.println(subs.toString());

		List<String> newSubs = subs.stream()
				.filter(a -> a.length() >= minLength && a.length() <= maxLength)
				.filter(b -> b.chars()
						.distinct()
						.count() <= maxLetters)
				.collect(Collectors.toList());

		System.out.println(newSubs.toString());

		if(newSubs.size() > 0)
		{
			/*maxOccurence = newSubs.stream()
					.map(e -> Collections.frequency(newSubs, e))
					.sorted(Comparator.reverseOrder())
					.findFirst()
					.get();*/

			maxOccurence = newSubs.stream()
					.map(e -> Collections.frequency(newSubs, e))
					.max(Comparator.comparingInt(Integer::intValue))
					.get();
		}

		return maxOccurence;
	}

	public static void main(String[] args)
	{
		String s = "abcde";

		System.out.println(getSubtringFrequncies(s, 2, 2, 3));
	}
}
