package com.org.various.sources;

import java.util.ArrayList;
import java.util.List;

public class SubArrayProductEqualsK
{
	public static int countSubarraysWithProduct(List<Integer> list, int k)
	{
		int count = 0;
		int product = 1;
		int left = 0;

		for(int right = 0; right < list.size(); right++)
		{
			product *= list.get(right);

			while (left <= right && product > k)
			{
				product /= list.get(left);
				left++;
			}

			if(product == k)
			{
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(3);
		list.add(4);

		int k = 6;
		System.out.println("Number of subarrays with product " + k + ": " + countSubarraysWithProduct(list, k));
	}
}
