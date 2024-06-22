package org.sample;

import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MostCommonString
{
	public static void main(String[] args)
	{
		List<String> list = List.of("test", "test", "hello", "test");

		String mostRepeatedWord = list.stream()
				.collect(Collectors.groupingBy(w -> w, Collectors.counting()))
				// .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet()
				.stream()
				.max(Comparator.comparing(Entry::getValue))
				.get()
				.getKey();
		System.out.println("Most common word: " + mostRepeatedWord);
	}
}
