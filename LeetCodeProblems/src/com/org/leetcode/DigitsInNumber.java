package com.org.leetcode;

import java.util.Arrays;

public class DigitsInNumber
{
	public int findNumbers(int[] nums)
	{
		long numbersSize = Arrays.stream(nums)
				.boxed()
				.filter(a -> (String.valueOf(a)).length() % 2 == 0)
				.count();

		return (int) numbersSize;
	}

	public static void main(String[] args)
	{
		int[] nums = {12, 345, 2, 6, 7896};
		DigitsInNumber din = new DigitsInNumber();

		System.out.println(din.findNumbers(nums));
	}

}
