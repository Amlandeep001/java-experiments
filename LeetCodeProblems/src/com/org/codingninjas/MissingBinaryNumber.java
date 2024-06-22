package com.org.codingninjas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

//https://www.codingninjas.com/studio/problems/missing-number_1229390?interviewProblemRedirection=true&leftPanelTabValue=PROBLEM&count=25&page=2&search=&sort_entity=order&sort_order=ASC&customSource=studio_nav
public class MissingBinaryNumber
{
	public static String findMissingNumber(ArrayList<String> binaryNums, int n)
	{
		// Write your code here
		int missingDecimal = findMissingDecimal(binaryNums, n);
		return Integer.toBinaryString(missingDecimal);
	}

	private static int findMissingDecimal(ArrayList<String> binaryNums, int n)
	{
		HashSet<Integer> set = new HashSet<>();

		for(int i = 0; i <= n; i++)
		{
			set.add(i);
		}

		for(String binary : binaryNums)
		{
			int decimal = Integer.parseInt(binary, 2);
			set.remove(decimal);
		}

		return set.iterator().next();
	}

	public static void main(String[] args)
	{
		ArrayList<String> binaryNums = new ArrayList<>(Arrays.asList("0", "01", "010", "100", "101"));

		System.out.println(MissingBinaryNumber.findMissingNumber(binaryNums, 5));
	}
}
