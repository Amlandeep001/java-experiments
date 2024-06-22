package com.org.codingninjas;

import java.util.Arrays;

public class ProductOfArrayExceptSelf
{
	public static int[] getProductArrayExceptSelf(int[] arr)
	{
		// Your code goes here
		int n = arr.length;
		int MOD = 1000000007;

		if(n == 0)
		{
			return new int[0]; // Return an empty array if input array is empty
		}

		// Calculate prefix products
		int[] prefix = new int[n];
		prefix[0] = 1;
		for(int i = 1; i < n; i++)
		{
			prefix[i] = (int) (((long) prefix[i - 1] * arr[i - 1]) % MOD);
		}

		// Calculate suffix products
		int[] suffix = new int[n];
		suffix[n - 1] = 1;
		for(int i = n - 2; i >= 0; i--)
		{
			suffix[i] = (int) (((long) suffix[i + 1] * arr[i + 1]) % MOD);
		}

		// Calculate the final result
		int[] result = new int[n];
		for(int i = 0; i < n; i++)
		{
			result[i] = (int) (((long) prefix[i] * suffix[i]) % MOD);
		}

		return result;
	}

	public static void main(String[] args)
	{
		int[] arr = {0};
		System.out.println(Arrays.toString(ProductOfArrayExceptSelf.getProductArrayExceptSelf(arr)));
	}

}
