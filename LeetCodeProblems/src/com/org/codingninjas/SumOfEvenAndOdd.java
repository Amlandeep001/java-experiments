package com.org.codingninjas;

import java.util.Arrays;

//https://www.naukri.com/code360/problems/sum-of-even-odd_893199?topList=accenture-interview-questions&problemListRedirection=true&leftPanelTabValue=PROBLEM&count=25&page=1&search=&sort_entity=order&sort_order=ASC
public class SumOfEvenAndOdd
{
	public static int[] sumOfEvenOdd(long num, int evenSum, int oddSum)
	{
		/*
		 * Write your code here and return array with even Sum at 0th index oddSum at
		 * 1st index
		 */

		String number = String.valueOf(num);
		String[] numberArr = number.split("");

		for(int i = 0; i < numberArr.length; i++)
		{
			int digit = Integer.parseInt(numberArr[i]);

			if(digit % 2 == 0)
			{
				evenSum += digit;
			}
			else
			{
				oddSum += digit;
			}
		}

		return new int[]{evenSum, oddSum};
	}

	public static void main(String[] args)
	{
		System.out.println(Arrays.toString(sumOfEvenOdd(1234, 0, 0)));
	}

}
