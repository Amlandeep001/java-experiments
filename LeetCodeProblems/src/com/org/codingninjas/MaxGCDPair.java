package com.org.codingninjas;

//https://www.naukri.com/code360/problems/max-gcd-pair_842786?topList=top-amazon-coding-interview-questions&problemListRedirection=true&count=25&page=2&search=&sort_entity=order&sort_order=ASC&leftPanelTabValue=PROBLEM&customSource=studio_nav
public class MaxGCDPair
{
	// Function to compute GCD using the Euclidean Algorithm
	public static int gcd(int a, int b)
	{
		return b == 0 ? a : gcd(b, a % b);
	}

	public static int maxGCDPair(int[] arr, int n)
	{
		if(n < 2)
		{
			throw new IllegalArgumentException("At least two elements are required to find GCD pairs.");
		}

		// Initialize the maximum GCD to a minimal value
		int maxGCD = 0;

		// Iterate through the array and compare each element with all other elements
		for(int i = 0; i < n; i++)
		{
			for(int j = i + 1; j < n; j++)
			{
				int currentGCD = gcd(arr[i], arr[j]);
				if(currentGCD > maxGCD)
				{
					maxGCD = currentGCD;
				}
			}
		}
		return maxGCD;
	}

	public static void main(String[] args)
	{
		int[] arr = {1, 5, 2, 3, 4};
		int n = arr.length;

		int result = maxGCDPair(arr, n);
		System.out.println("Maximum GCD of a pair: " + result); // Expected Output: 2
	}
}
