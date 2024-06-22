package com.org.leetcode;

//https://leetcode.com/problems/sqrtx/description/
public class SquareRoot
{
	public static int mySqrt(int x)
	{
		long left = 0, right = (x / 2) + 1;

		while (left < right)
		{
			long mid = left + (right - left) / 2 + 1;
			long square = mid * mid;

			if(square == x)
			{
				return (int) mid;
			}
			else if(square < x)
			{
				left = mid;
			}
			else
			{
				right = mid - 1;
			}
		}
		return (int) left;
	}

	public static void main(String[] args)
	{
		System.out.println(SquareRoot.mySqrt(5));
	}
}
