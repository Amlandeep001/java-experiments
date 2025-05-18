package com.org.codingninjas;

import java.util.Comparator;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

//https://www.naukri.com/code360/problems/highest-occurring-character_624400?leftPanelTabValue=PROBLEM&count=25&page=1&search=&sort_entity=order&sort_order=ASC&customSource=studio_nav

public class HighestOccuringCharacter
{
	public static char highestOccuringChar(String str)
	{
		// Your code goes here

		return str.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet()
				.stream()
				.sorted(Entry.comparingByValue(Comparator.reverseOrder()))
				.map(Entry::getKey)
				.findFirst()
				.get();
	}

	public static void main(String[] args)
	{
		String str = "abcdeapapqarr";
		System.out.println("Highest Occuring Character: " + highestOccuringChar(str));
	}

}
