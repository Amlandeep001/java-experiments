package org.sample;

import java.time.Instant;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SampleStream
{

	public static void main(String... a)
	{
		List<String> al = Arrays.asList("abc", "xyza", "mnopq");

		List<String> nal = al.stream()
				.filter(n -> n.contains("a"))
				.sorted(Comparator.comparing(String::length).reversed())
				.collect(Collectors.toList());

		nal.forEach(System.out::println);
		System.out.println(Instant.now());

		List<Integer> intList = List.of(0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1);

		Map<String, List<Integer>> numberGroups = intList.stream()
				.collect(Collectors.groupingBy(item -> item == 0 ? "ZerosList" : "OnesList"));

		numberGroups.get("ZerosList").addAll(numberGroups.get("OnesList"));

		System.out.println(numberGroups.get("ZerosList"));

		// System.out.println(numberGroups.get("ZerosList") +"\n" +
		// numberGroups.get("OnesList"));

		List<Integer> intcapList = List.of(1, 2, 6, 8, 7, 5, 9, 4, 3);

		// int pivot = intcapList.stream().filter(x -> x == 4).findAny().orElse(null);

		Map<String, List<Integer>> intgerGroups = intcapList.stream()
				.collect(Collectors.groupingBy(item -> item > 4 ? "RightList" : "LeftList"));

		intgerGroups.get("LeftList").addAll(intgerGroups.get("RightList"));

		Collections.sort(intgerGroups.get("LeftList"));

		System.out.println(intgerGroups.get("LeftList"));
	}
}
