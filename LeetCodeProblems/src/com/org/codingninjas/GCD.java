package com.org.codingninjas;

import java.util.Scanner;

public class GCD
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int X = input.nextInt();
		int Y = input.nextInt();

		/*int gcd = 1;
		for(int i = 1; i <= X && i <= Y; i++)
		{
			if(X % i == 0 && Y % i == 0)
			{
				gcd = i;
			}
		}*/

		int gcd = calculateGCD(X, Y);
		System.out.println(gcd);
		input.close();
	}

	// Function to compute GCD of two numbers using Euclidean Algorithm
	private static int calculateGCD(int x, int y)
	{
		return y == 0 ? x : calculateGCD(y, x % y);
	}
}
