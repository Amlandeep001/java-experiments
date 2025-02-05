package com.org.leetcode;

public class LengthOfLastWord
{
    public static void main(String[] args)
    {
        LengthOfLastWord obj = new LengthOfLastWord();
        int length = obj.lengthOfLastWord("Hello World");
        System.out.println(length);
    }

    public int lengthOfLastWord(String s)
    {
        // 1st Approach:
        /*String[] strArr = s.split(" ");

        int length = 0;
        for (int i = 0; i < strArr.length; i++)
        {
            if (strArr[i].length() > 0)
            {
                length = strArr[i].length();
            }
        }
        return length;*/

        //2nd Approach:
        /*int length = 0;
        int index = s.length() - 1;
        while (index >= 0 && s.charAt(index) == ' ')
        {
            index--;
        }
        while (index >= 0 && s.charAt(index) != ' ')
        {
            length++;
            index--;
        }
        return length;*/

        //3rd Approach:
        return s.trim().split(" ")[s.trim().split(" ").length - 1].length();
    }
}
