package com.org.codingninjas;

import java.util.Arrays;

//https://www.naukri.com/code360/problems/concatenate-the-largest-digit_1263688?topList=top-salesforce-coding-interview-questions&problemListRedirection=true&difficulty%5B%5D=Easy&leftPanelTabValue=PROBLEM
public class ConcatenateTheLargestDigit
{
	public static int concatLargestDigit(int a, int b, int c)
	{
		// Write your code here.
		char[] ch1 = String.valueOf(a).toCharArray();
		char[] ch2 = String.valueOf(b).toCharArray();
		char[] ch3 = String.valueOf(c).toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);
		Arrays.sort(ch3);

		String resultantString = new StringBuilder()
				.append(ch1[ch1.length - 1])
				.append(ch2[ch2.length - 1])
				.append(ch3[ch3.length - 1])
				.toString();

		return Integer.parseInt(resultantString);
	}

	public static void main(String[] args)
	{
		System.out.println(concatLargestDigit(5678, 45, 769));
	}
}
