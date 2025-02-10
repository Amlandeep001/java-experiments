package com.org.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Amlan
 * Link: https://leetcode.com/problems/valid-palindrome/submissions
 */
public class ValidPalindrome
{
    public boolean isPalindrome(String s)
    {
        List<String> list = Arrays.asList(s.split(""));

        String ts = list.stream()
                .map(e -> e.toLowerCase())
                .filter(a -> a.chars().allMatch(Character::isLetterOrDigit))
                .collect(Collectors.joining());

        StringBuilder sb = new StringBuilder(ts).reverse();

        return sb.toString().equals(ts);
    }

}
