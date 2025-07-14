package org.sample.searching;

import java.util.Arrays;
import java.util.List;

public class LinearSearch
{
	public static void main(String[] args)
	{
		int n = 5;
		int x = 12;

		int a[] = new int[n];

		a[0] = 5;// initialization
		a[1] = 9;
		a[2] = 12;
		a[3] = 20;
		a[4] = 25;

		for(int i = 0; i < n; i++)
		{
			if(i > n)
			{
				System.out.println("Element not found");
			}
			else if(a[i] == x)
			{
				System.out.println("Element found, value of index =" + i);
			}
		}

		List<Integer> intList = Arrays.asList(5, 9, 12, 20, 25);

		int n1 = intList.size();
		int x1 = 12;

		for(int j = 0; j < n1; j++)
		{
			if(j > n1)
			{
				System.out.println("Element not found");
			}
			else if(a[j] == x1)
			{
				System.out.println("Element found, value of index =" + j);
			}
		}
	}

}
