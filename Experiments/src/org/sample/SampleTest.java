package org.sample;

import java.util.Random;

public class SampleTest
{
	public static void main(String args[])
	{
		String s = "2255039785";

		String s2 = s.replaceFirst(".{9}$", generateRandom());

		System.out.println(s2);
	}

	private static String generateRandom()
	{
		Random rnd = new Random();
		int number = rnd.nextInt(999999999);

		return String.valueOf(number);
	}
}
