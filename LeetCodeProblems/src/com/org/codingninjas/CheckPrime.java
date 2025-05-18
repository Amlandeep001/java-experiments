package com.org.codingninjas;

import java.util.Scanner;

//https://www.naukri.com/code360/problems/check-prime_624674?leftPanelTabValue=PROBLEM&count=25&search=&sort_entity=order&sort_order=ASC&customSource=studio_nav&page=2

public class CheckPrime
{
	public static void main(String[] args)
	{
		try(Scanner scan = new Scanner(System.in))
		{
			int number = scan.nextInt();

			boolean result;

			if(number <= 1)
			{
				result = false;
			}
			else if(number <= 3)
			{
				result = true;
			}
			else if(number % 2 == 0 || number % 3 == 0)
			{
				result = false;
			}
			else
			{
				result = true;
				for(int i = 5; i * i <= number; i += 6)
				{
					if(number % i == 0 || number % (i + 2) == 0)
					{
						result = false;
						break;
					}
				}
			}

			System.out.println(result);
		}
	}
}
