package com.org.leetcode;

import java.util.Arrays;
import java.util.stream.IntStream;

// https://leetcode.com/problems/missing-number
public class MissingNumberII
{
    public static int missingNumber(int[] nums)
    {
        int sum = Arrays.stream(nums)
                .sum();

        int superSum = IntStream.rangeClosed(0, nums.length)
                .sum();

        return superSum - sum;
    }

    public static void main(String[] args)
    {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(missingNumber(nums)); // Output: 8
    }
}
