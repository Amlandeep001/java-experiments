package com.org.codingninjas;

import java.util.Arrays;

public class SumOfArrays
{
	public static int[] findArraySum(int[] a, int n, int[] b, int m)
	{
		String intStr1 = "";
		String intStr2 = "";

		for(int i = 0; i < n; i++)
		{
			String s1 = String.valueOf(a[i]);
			intStr1 += s1;
		}

		for(int j = 0; j < m; j++)
		{
			String s2 = String.valueOf(b[j]);
			intStr2 += s2;
		}

		int addition = Integer.parseInt(intStr1) + Integer.parseInt(intStr2);
		String[] additionArray = String.valueOf(addition).split("");

		return Arrays.stream(additionArray)
				.mapToInt(Integer::parseInt)
				.toArray();
	}

	public static void main(String[] args)
	{
		int[] a = {1, 2, 3, 4}, b = {6};

		System.out.println(Arrays.toString(SumOfArrays.findArraySum(a, 4, b, 1)));
	}

}
