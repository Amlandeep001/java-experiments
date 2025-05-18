package com.org.codingninjas;

import java.util.Arrays;

//https://www.naukri.com/code360/problems/push-zeros-to-end_583?leftPanelTabValue=PROBLEM&count=25&page=2&search=&sort_entity=order&sort_order=ASC&customSource=studio_nav

public class PushZerosToend
{
	public static void pushZerosAtEnd(int[] arr)
	{
		// Your code goes here

		/*Map<Boolean, List<Integer>> map = Arrays.stream(arr)
				.boxed()
				.collect(Collectors.partitioningBy(n -> n == 0));
		List<Integer> list = map.get(false);
		list.addAll(map.get(true));
		
		int[] newArr = list.stream()
				.mapToInt(Integer::intValue)
				.toArray();
		
		System.out.println(Arrays.toString(newArr));*/

		int pos = 0; // Position to place next non-zero

		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] != 0)
			{
				arr[pos++] = arr[i];
			}
		}

		// Fill remaining positions with 0
		while (pos < arr.length)
		{
			arr[pos++] = 0;
		}

		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		int[] arr = {5, 0, 7, 4, 8, 1, 3, 0, 7, 2, 0};
		pushZerosAtEnd(arr);
	}

}
