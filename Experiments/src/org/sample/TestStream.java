package org.sample;

import java.util.HashMap;
import java.util.Map;

public class TestStream
{

	public static void main(String args[])
	{
		Map<String, String> empMap = new HashMap<>();

		empMap.put("IT", "1");
		empMap.put("ECE", "2");
		empMap.put("EIE", "3");
		empMap.put("CSE", "4");

		empMap.entrySet().stream()
				.filter(a -> a.getValue().equals("4"))
				.map(b -> b.getKey())
				.forEach(System.out::println);
	}
}
