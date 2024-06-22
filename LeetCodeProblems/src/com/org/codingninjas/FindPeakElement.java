package com.org.codingninjas;

import java.util.ArrayList;
import java.util.Arrays;

//https://www.naukri.com/code360/problems/find-peak-element_1081482?interviewProblemRedirection=true&search=peak&attempt_status=ATTEMPTED&leftPanelTabValue=SUBMISSION
public class FindPeakElement
{
	public static int findPeakElement(ArrayList<Integer> arr)
	{
		// Write your code here.

		int n = arr.size();
		int left = 0;
		int right = n - 1;

		while (left < right)
		{
			int mid = left + (right - left) / 2;

			// Compare the middle element with its right neighbor
			if(arr.get(mid) < arr.get(mid + 1))
			{
				left = mid + 1; // Move right
			}
			// Compare the middle element with its left neighbor
			else
			{
				right = mid; // Move left (or stay at mid if it's a peak)
			}
		}

		return left; // Return the index of the peak element
	}

	public static void main(String[] args)
	{
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		System.out.println(findPeakElement(arr));
	}

}
