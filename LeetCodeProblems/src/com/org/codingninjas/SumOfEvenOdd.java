package com.org.codingninjas;

import java.util.Scanner;

//https://www.codingninjas.com/studio/problems/sum-of-even-odd_624650?interviewProblemRedirection=true&leftPanelTabValue=PROBLEM
public class SumOfEvenOdd
{
	public static void main(String[] args)
	{
		// Write your code here
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		String str = String.valueOf(n);
		String[] strArr = str.split("");

		int evenSum = 0;
		int oddSum = 0;

		for(int i = 0; i < strArr.length; i++)
		{
			int k = Integer.parseInt(strArr[i]);

			if(k % 2 == 0)
			{
				evenSum += k;
			}
			else
			{
				oddSum += k;
			}
		}

		System.out.println(evenSum + " " + oddSum);
		s.close();
	}
}
