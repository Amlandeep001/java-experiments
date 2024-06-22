package com.org.geeksforgeeks;

import java.util.HashMap;
import java.util.Map;

//https://www.geeksforgeeks.org/problems/java-hashmap1033/1
public class MapOperations
{
	static int map(int n, String keys[], int arr[], String s)
	{
		// code here

		Map<String, Integer> map = new HashMap<>();

		for(int i = 0; i < n; i++)
		{
			map.put(keys[i], arr[i]);
		}

		System.out.println(map.toString());

		if(map.get(s) != null)
		{
			return map.get(s);
		}
		else
		{
			return -1;
		}
	}

	public static void main(String[] args)
	{
		String[] keys = {"sak", "varun", "vijay"};
		int[] arr = {5, 7, 3};

		System.out.println(MapOperations.map(3, keys, arr, "sak"));
	}

}
