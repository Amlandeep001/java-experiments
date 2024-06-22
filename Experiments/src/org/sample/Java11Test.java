package org.sample;

public class Java11Test
{
	public static void main(String args[])
	{
		String multilineString = "Baeldung helps \n \n developers \n explore Java.";

		multilineString.lines()
				.filter(line -> !line.isBlank())
				.map(String::strip)
				// .collect(Collectors.toList())
				.forEach(System.out::println);

		// lines.forEach(n -> System.out.println(n));

		String abc = "I am   Amlan  Deep Nandi ";

		System.out.println(abc.trim().replaceAll("\\s+", " "));
	}
}
