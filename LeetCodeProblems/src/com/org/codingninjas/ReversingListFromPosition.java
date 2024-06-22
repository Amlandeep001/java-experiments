package com.org.codingninjas;

import java.util.ArrayList;
import java.util.Arrays;

public class ReversingListFromPosition
{
	public static void reverseArray(ArrayList<Integer> arr, int m)
	{
		// Write your code here.

		/*ArrayList<Integer> tempList = new ArrayList<>();
		
		for(int i = m + 1; i < arr.size(); i++)
		{
			tempList.add(arr.get(i));
		}
		
		arr.removeAll(tempList);
		
		for(int j = tempList.size() - 1; j >= 0; j--)
		{
			arr.add(tempList.get(j));
		}*/

		/*int n = arr.size();
		
		int[] a = arr.stream().mapToInt(i -> i).toArray();
		
		for(int i = m + 1; i < n; i++)
		{
			int tempswap = a[i];
			a[i] = a[n - i - 1];
			a[n - i - 1] = tempswap;
		}
		
		System.out.println(Arrays.toString(a));*/

		ArrayList<Integer> temp = new ArrayList<>();

		for(int i = arr.size() - 1; i > m; i--)
		{
			temp.add(arr.get(i));
			arr.remove(i);
		}

		arr.addAll(temp);

		System.out.println(arr.toString());
	}

	public static void main(String[] args)
	{
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 4, 5, 6, 6, 7, 7));
		ReversingListFromPosition.reverseArray(arr, 3);
	}
}
