package com.org.leetcode;

import java.util.Arrays;
import java.util.Collections;

// https://leetcode.com/problems/third-maximum-number/description/
public class ThirdMaxNumber
{
    public static int thirdMax(int[] nums) {

        int[] arrDesc = Arrays.stream(nums).boxed()
                .distinct()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        if(nums.length < 3)
        {
            return arrDesc[0];
        }
        return arrDesc.length >= 3 ?  arrDesc[2] :  arrDesc[0];
    }

    public static void main(String[] args)
    {
        int[] nums = {3,2,1};
        System.out.println("Third Max Number: " + thirdMax(nums));
    }
}
