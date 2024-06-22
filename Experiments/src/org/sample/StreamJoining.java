package org.sample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamJoining
{
	public String transform(String s)
	{
		List<String> strs = Arrays.asList(s.split(" "));

		return strs.stream()
				.map(w -> Character.toUpperCase(w.charAt(0)) + w.substring(1))
				.collect(Collectors.joining(" "));
	}

	public static void main(String[] args)
	{
		/*List<String> newList = List.of("a", "b", "c");
		List<String> nullList = null;
		
		String joinedNewList = newList.stream().collect(Collectors.joining(","));
		System.out.println(joinedNewList);
		
		// null check will be always required for below reasons
		String joinedNullList = nullList.stream().collect(Collectors.joining(","));
		System.out.println(joinedNullList);*/

		String s = "i love programming";

		StreamJoining sj = new StreamJoining();

		System.out.println(sj.transform(s));
	}
}
