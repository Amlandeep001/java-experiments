package com.org.leetcode;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class CountDigitsThatDividesAnumber
{
	public static int countDigits(int num)
	{
		int count = 0, n = num;
		while (n > 0)
		{
			int digit = n % 10;
			if(num % digit == 0)
			{
				count++;
			}
			n /= 10;
		}
		return count;
	}

	public static void main(String[] args)
	{
		int num = 121;
		System.out.println(countDigits(num)); // Output: 2
		num = 123456789;
		System.out.println(countDigits(num)); // Output: 9
		num = 0;
		System.out.println(countDigits(num)); // Output: 0
		num = 7;
		System.out.println(countDigits(num)); // Output: 1
		num = 1111111111;
		System.out.println(countDigits(num)); // Output: 10
	}

}
