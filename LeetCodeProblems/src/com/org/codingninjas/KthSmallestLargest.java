package com.org.codingninjas;

import java.util.Arrays;
import java.util.Scanner;

//https://www.naukri.com/code360/problems/kth-smallest-largest-element-in-an-array_1230551?interviewProblemRedirection=true&practice_topic%5B%5D=SQL&practice_topic%5B%5D=Arrays&practice_topic%5B%5D=Sorting&difficulty%5B%5D=Easy&leftPanelTabValue=PROBLEM

public class KthSmallestLargest
{
	static void kthSmallestLargest(int arr[], int n, int k)
	{
		int[] newArr = Arrays.stream(arr)
				.distinct()
				.sorted()
				.toArray();

		if(k > newArr.length)
		{
			System.out.println(-1 + " " + -1);
			return;
		}

		int kthSmallest = 0;
		int kthLargest = 0;

		if(newArr.length > 0)
		{
			kthSmallest = newArr[k - 1];
			kthLargest = newArr[newArr.length - k];
		}
		else
		{
			kthSmallest = kthLargest = arr[k];
		}

		System.out.println(kthLargest + " " + kthSmallest);
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0)
		{
			int n = sc.nextInt();
			int k = sc.nextInt();

			int arr[] = new int[n];
			for(int i = 0; i < n; i++)
			{
				arr[i] = sc.nextInt();
			}
			kthSmallestLargest(arr, n, k);
			t--;
		}
		sc.close();
	}

}
