package com.org.codingninjas;

//https://www.naukri.com/code360/problems/count-zeros_58518?kunjiRedirection=true&leftPanelTabValue=PROBLEM
public class CountZerosInNumber
{
	public static int countZerosRec(int input)
	{
		// Write your code here

		if(input == 0)
		{
			return 1;
		}
		// If input is a single digit and it's 0, return 1
		if(input < 10)
		{
			return input == 0 ? 1 : 0;
		}

		// Recursive case: if the last digit is 0, add 1 to the count
		if(input % 10 == 0)
		{
			return 1 + countZerosRec(input / 10);
		}
		else
		{
			return countZerosRec(input / 10);
		}
	}

	public static void main(String[] args)
	{
		System.out.println(countZerosRec(708000));
	}
}
