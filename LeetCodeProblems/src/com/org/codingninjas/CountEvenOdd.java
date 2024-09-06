package com.org.codingninjas;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//https://www.naukri.com/code360/problems/count-even-odd_757508?interviewProblemRedirection=true&page=4&practice_topic%5B%5D=Arrays&difficulty%5B%5D=Easy&leftPanelTabValue=PROBLEM
public class CountEvenOdd
{
    public static int[] countEvenOdd(int[] arr, int n)
    {
        // Write your code here.
        int countEven = 0, countOdd = 0;
        Map<Integer, Long> map = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));
        for (Map.Entry<Integer, Long> entry : map.entrySet())
        {
            if (entry.getValue() % 2 == 0)
            {
                countEven++;
            }
            else
            {
                countOdd++;
            }
        }
        return new int[]{countOdd, countEven};
    }

    public static void main(String[] args)
    {
        int[] arr = {2, 1, 2, 1, 5, 5, 2};
        System.out.println(Arrays.toString(countEvenOdd(arr, arr.length)));
    }
}
