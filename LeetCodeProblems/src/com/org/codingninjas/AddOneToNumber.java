package com.org.codingninjas;

import java.util.ArrayList;
import java.util.Arrays;

//https://www.naukri.com/code360/problems/add-one-to-number_873367?interviewProblemRedirection=true&leftPanelTabValue=PROBLEM&count=25&search=add%20&sort_entity=order&sort_order=ASC&customSource=studio_nav&page=1&difficulty%5B%5D=Easy
public class AddOneToNumber
{
	public static ArrayList<Integer> addOneToNumber(ArrayList<Integer> arr)
	{
		// Write your code here.

		int n = arr.size();

		// Traverse the array from right to left
		for(int i = n - 1; i >= 0; i--)
		{
			// If the digit is less than 9, simply increment it and return
			if(arr.get(i) < 9)
			{
				arr.set(i, arr.get(i) + 1);
				// Remove leading zeros
				while (arr.size() > 1 && arr.get(0) == 0)
				{
					arr.remove(0);
				}
				return arr;
			}
			else
			{
				// If the digit is 9, set it to 0 and continue to the next digit
				arr.set(i, 0);
			}
		}

		// If we're here, it means all digits were 9
		// Add an extra digit (1) to the end of the array
		arr.add(0);
		arr.set(0, 1);

		return arr;
	}

	public static void main(String[] args)
	{
		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(0, 2));

		System.out.println(addOneToNumber(arr));
	}
}
