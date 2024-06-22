package com.org.codingninjas;

import java.util.Scanner;

//https://www.codingninjas.com/studio/problems/print-array-sum_625032?interviewProblemRedirection=true&leftPanelTabValue=PROBLEM&customSource=studio_nav
public class PrintArraySum
{
	public static void main(String[] args)
	{
		/* Your class should be named Solution.
		* Read input as specified in the question.
		* Print output as specified in the question.
		*/
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];

		for(int i = 0; i < n; i++)
		{
			// reading array elements from the user
			array[i] = sc.nextInt();
		}

		int sum = 0;
		for(int j = 0; j < n; j++)
		{
			// adding array elements to get the sum
			sum += array[j];
		}

		System.out.println(sum);
		sc.close();
	}

}
