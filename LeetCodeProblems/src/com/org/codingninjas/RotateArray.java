package com.org.codingninjas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RotateArray
{
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k)
	{
		// Write your code here.

		ArrayList<Integer> newList = new ArrayList<>();

		for(int i = arr.size() - 1; i >= k; i--)
		{
			newList.add(arr.get(i));
			arr.remove(i);
		}

		Collections.reverse(newList);
		newList.addAll(arr);

		return newList;
	}

	public static void main(String[] args)
	{
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(3, 5, 22, 54, 12, 32, 76, 44, 43, 21, 65, 33, 211, 65, 23, 98, 23, 43, 11, 1));
		System.out.println(RotateArray.rotateArray(arr, 10));
	}
}
