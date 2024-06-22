package com.org.codingninjas;

import java.util.ArrayList;
import java.util.Arrays;

//https://www.naukri.com/code360/problems/division-of-4_893337?interviewProblemRedirection=true&search=four&attempt_status=COMPLETED
public class DivisionByFour
{
	public static void divideByFour(ArrayList<Integer> arr)
	{
		// Write your code here.

		/*List<Integer> list = arr.stream()
				.map(e -> e / 4 != 0 ? e / 4 : -1)
				.collect(Collectors.toList());*/

		int c = 0;

		for(int i = 0; i < arr.size(); i++)
		{
			c = arr.get(i) / 4 == 0 ? -1 : arr.get(i) / 4;
			arr.set(i, c);
		}

		System.out.println(arr);
	}

	public static void main(String[] args)
	{
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(4, 8, 12));
		divideByFour(arr);
	}

}
