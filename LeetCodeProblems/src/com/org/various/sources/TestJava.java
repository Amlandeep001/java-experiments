package com.org.various.sources;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.stream.Collectors;

public class TestJava
{
	public static void main(String[] args)
	{
		/*String str = "I am Amlandeep Nandi";
		
		List<String> strs = Arrays.asList(str.split(" "));
		
		String longestWrord = strs.stream()
				.max(Comparator.comparing(String::length))
				.get();
		
		System.out.println(longestWrord);*/

		/*ArrayList rawList = new ArrayList();
		
		rawList.add("Hello");
		rawList.add(42);
		
		for(Object item : rawList)
		{
			if(item instanceof String)
			{
				System.out.print("String ");
			}
			else if(item instanceof Integer)
			{
				System.out.print("Integer ");
			}
		}*/

		List<Integer> list = Arrays.asList(0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 0, 0, 1);

		List<Integer> groupedList = list.stream()
				.collect(Collectors.groupingBy(i -> i))
				.values()
				.stream()
				.flatMap(List::stream)
				.collect(Collectors.toList());

		System.out.println(groupedList);

		Hashtable<String, Integer> ht = new Hashtable<>();

		ht.put("abc", 123);
		ht.put("xyz", 543);

		System.out.println(ht);
	}
}
