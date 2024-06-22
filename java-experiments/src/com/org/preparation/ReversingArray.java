package com.org.preparation;

import java.util.Arrays;

public class ReversingArray
{
	public static void main(String[] args)
	{
		int[] arr = {10, 20, 30, 40, 50};
		reverse(arr);
	}

	private static void reverse(int[] arr)
	{
		int[] reversedArray = new int[arr.length];
		int index = arr.length;

		for(int i = 0; i < index; i++)
		{
			reversedArray[index - 1] = arr[i];
			index = index - 1;
		}

		System.out.println(Arrays.toString(reversedArray));
	}
}
