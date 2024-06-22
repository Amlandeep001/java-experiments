package com.org.preparation;

import java.util.Scanner;

public class SingleDArray
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];

		// Prints each sequential element in array a
		for(int i = 0; i < a.length; i++)
		{
			int value = scan.nextInt();
			a[i] = value;
			System.out.println(a[i]);
		}

		scan.close();
	}

}
