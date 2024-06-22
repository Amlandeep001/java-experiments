package com.org.codingninjas;

import java.util.Scanner;

public class GreatestCommonDivisor
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int X = input.nextInt();
		int Y = input.nextInt();

		/*List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 1; i <= X && i <= Y; i++)
		{
			if(X % i == 0 && Y % i == 0)
			{
				list.add(i);
			}
		}*/

		int GCD = findGCD(X, Y);

		// System.out.println(list.get(list.size() - 1));
		System.out.println(GCD);
		input.close();
	}

	private static int findGCD(int x, int y)
	{
		return y == 0 ? x : findGCD(y, x % y);
	}
}
