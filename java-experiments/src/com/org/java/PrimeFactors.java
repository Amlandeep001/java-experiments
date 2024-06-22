package com.org.java;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PrimeFactors
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		System.out.println("number: " + number);

		primefacors(number);

		input.close();
	}

	private static void primefacors(int number)
	{
		List<Integer> primeFacotrs = new LinkedList<>();

		for(int i = 2; i <= number; i++)
		{
			while (number % i == 0)
			{
				primeFacotrs.add(i);
				number = number / i;
			}
		}
		primeFacotrs.forEach(System.out::println);
	}
}
