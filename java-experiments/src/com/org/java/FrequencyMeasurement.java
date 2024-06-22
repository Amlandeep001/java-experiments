package com.org.java;

import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 
 * @author Amlan
 * input = babdc, output = a1b2c1d1
 */
public class FrequencyMeasurement
{

	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		String str = scn.next();

		calculateFrequency(str);

		scn.close();
	}

	private static void calculateFrequency(String str)
	{
		List<String> strList = List.of(str.split(""));

		String sl = strList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet()
				.stream()
				.map(e -> e.getKey() + e.getValue())
				.collect(Collectors.joining());

		System.out.println(sl);
	}
}
