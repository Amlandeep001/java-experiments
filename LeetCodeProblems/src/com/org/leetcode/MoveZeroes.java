package com.org.leetcode;

import java.util.Arrays;

//https://leetcode.com/problems/move-zeroes/description/
public class MoveZeroes
{
    public static void main(String[] args)
    {
        int[] nums = {2, 0, 4, 1, 3, 0, 28};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums)
    {
        int lastZeroPosition = 0; // This marks the last zero swap position

        // Loop through the array
        for (int current = 0; current < nums.length; current++)
        {
            if (nums[current] != 0)
            {
                // Perform the swap
                int temp = nums[lastZeroPosition];
                nums[lastZeroPosition] = nums[current];
                nums[current] = temp;
                lastZeroPosition++;
            }
        }
        System.out.println("new array: " + Arrays.toString(nums));
    }
}
