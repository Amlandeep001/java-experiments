package com.org.codingninjas;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// https://www.naukri.com/code360/problems/find-the-repeating-and-missing-number_1062727?kunjiRedirection=true&leftPanelTabValue=PROBLEM
public class FindRepeatingAndMissingNumber
{
    public static int[] findRepeatingAndMissingNumbers(int[] nums)
    {
        // Write your code here
        Set<Integer> set = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toSet());
        int sumOfArray = Arrays.stream(nums)
                .sum();
        int sumOfSet = set.stream()
                .mapToInt(Integer::intValue)
                .sum();
        int missingNumber = IntStream.rangeClosed(1, nums.length)
                .filter(e -> !set.contains(e))
                .findFirst()
                .orElse(-1);

        int repeatingNumber = sumOfArray - sumOfSet;

        return new int[]{repeatingNumber, missingNumber};
    }

    public static void main(String[] args)
    {
        int[] nums = {1, 2, 3, 4, 4, 5};
        int[] result = findRepeatingAndMissingNumbers(nums);
        System.out.println("Repeating Number: " + result[0]);
        System.out.println("Missing Number: " + result[1]);
    }
}
