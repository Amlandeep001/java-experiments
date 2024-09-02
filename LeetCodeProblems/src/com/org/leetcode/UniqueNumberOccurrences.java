package com.org.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

//https://leetcode.com/problems/unique-number-of-occurrences/description/?envType=study-plan-v2&envId=leetcode-75
public class UniqueNumberOccurrences
{
    public static boolean uniqueOccurrences(int[] arr)
    {
        List<Long> list = Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .values()
                .stream()
                .toList();

        return list.size() == list.stream().distinct().toList().size();
    }

    public static void main(String[] args)
    {
        int[] arr = {1, 2, 2, 1, 3, 3};
        System.out.println(uniqueOccurrences(arr)); // true
    }
}
