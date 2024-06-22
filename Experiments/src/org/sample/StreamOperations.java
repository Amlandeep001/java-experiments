package org.sample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperations
{
	public static void main(String... a)
	{
		List<String> strList = Arrays.asList("tvc", "bnm", "xyz");

		String newStr = strList.stream().collect(Collectors.joining("."));

		System.out.println(newStr);
	}
}
