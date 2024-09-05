package com.org.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
public class FindAllNumbersDisappearedInArray
{
    public static List<Integer> findDisappearedNumbers(int[] nums)
    {
        Arrays.sort(nums);

        Set<Integer> set = new HashSet<>();
        for (int num : nums)
        {
            set.add(num);
        }

        return IntStream.rangeClosed(1, nums.length)
                .filter(e -> !set.contains(e))
                .boxed()
                .toList();
    }

    public static void main(String[] args)
    {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDisappearedNumbers(nums)); // Output: [5, 6]

        int[] arr = {2, 2};
        System.out.println(findDisappearedNumbers(arr)); // Output: [1]
    }
}
