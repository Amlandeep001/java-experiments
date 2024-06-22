package com.org.codingninjas;

import java.util.Scanner;

public class ReversingNumber
{
	public static void main(String[] args)
	{
		// Write your code here

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		String str = String.valueOf(N);
		StringBuilder sb = new StringBuilder(str);
		StringBuilder reversesb = sb.reverse();

		System.out.println(Integer.parseInt(reversesb.toString()));
		scanner.close();
	}

}
