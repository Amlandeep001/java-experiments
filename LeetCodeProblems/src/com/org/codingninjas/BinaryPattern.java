package com.org.codingninjas;

//https://www.naukri.com/code360/problems/binary-pattern_893335?interviewProblemRedirection=true
public class BinaryPattern
{
	public static void print(int n)
	{
		// Write your code here.
		/*for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n - i; j++)
			{
				if(i % 2 == 0)
				{
					System.out.print(1);
				}
				else
				{
					System.out.print(0);
				}
			}
			System.out.println();
		}*/

		boolean isOne = true; // Flag to alternate between printing '1's and '0's

		for(int i = n; i > 0; i--)
		{
			if(isOne)
			{
				System.out.println("1".repeat(i));
			}
			else
			{
				System.out.println("0".repeat(i));
			}

			isOne = !isOne;
		}
	}

	public static void main(String[] args)
	{
		int n = 5;
		print(n);
	}
}
