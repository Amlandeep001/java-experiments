package com.org.expriments.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TestAllStreamFeatures
{
	public static void main(String[] args)
	{
		List<String> givenList = Arrays.asList("a", "bb", "c", "d", "bb");

		// Collectors.toList()
		List<String> result = givenList.stream()
				.collect(Collectors.toList());
		System.out.println(result);

		// Collectors.toUnmodifiableList() //from Java 10
		List<String> resultUnmodifiable = givenList.stream()
				.collect(Collectors.toUnmodifiableList());

		System.out.println(resultUnmodifiable);

		/*assertThatThrownBy(() -> result.put("foo", 3))
		  .isInstanceOf(UnsupportedOperationException.class);*/

		// Collectors.toSet()
		Set<String> resultSet = givenList.stream()
				.collect(Collectors.toSet());

		System.out.println(resultSet);
	}
}
