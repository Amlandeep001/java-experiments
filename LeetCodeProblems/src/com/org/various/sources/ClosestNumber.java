package com.org.various.sources;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * A list of integers is given, find the closest numbers accordingly from the input 
 */
public class ClosestNumber
{
	/*public static int getClosestNumber(List<Integer> list, int target)
	{
		int closest = list.get(0);
		int minDiff = Math.abs(target - closest);
	
		for(int i = 1; i < list.size(); i++)
		{
			int diff = Math.abs(target - list.get(i));
	
			if(diff < minDiff)
			{
				minDiff = diff;
				closest = list.get(i);
			}
		}
		return closest;
	}
	
	public static void main(String[] args)
	{
		List<Integer> integerList = Arrays.asList(1, 4, 7, 11, 19);
	
		try(Scanner scanner = new Scanner(System.in))
		{
			while (true)
			{
				int target = scanner.nextInt();
				System.out.println(getClosestNumber(integerList, target));
			}
		}
	}*/

	public static void main(String[] args)
	{
		List<Integer> numbers = Arrays.asList(1, 4, 7, 11, 17);

		try(Scanner scanner = new Scanner(System.in))
		{
			while (true)
			{
				System.out.println("Enter a number: ");
				int num = scanner.nextInt();

				int closest = numbers.stream()
						.min((a, b) -> Integer.compare(Math.abs(a - num), Math.abs(b - num)))
						.get();

				System.out.println("Closest number to " + num + " is " + closest);
			}
		}
	}
}
