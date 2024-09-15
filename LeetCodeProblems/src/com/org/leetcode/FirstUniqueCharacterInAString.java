package com.org.leetcode;

import java.util.HashMap;

public class FirstUniqueCharacterInAString
{
    public static void main(String[] args)
    {
        System.out.println(firstUniqueChar("leetcode")); // 0

    }

    public static int firstUniqueChar(String s)
    {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++)
        {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s.length(); i++)
        {
            if (map.get(s.charAt(i)) == 1)
            {
                return i;
            }
        }
        return -1;
    }
}
