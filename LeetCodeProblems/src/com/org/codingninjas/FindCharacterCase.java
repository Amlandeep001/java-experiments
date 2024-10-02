package com.org.codingninjas;

//https://www.naukri.com/code360/problems/find-character-case_893185?interviewProblemRedirection=true&search=Find%20Cha&leftPanelTabValue=PROBLEM

public class FindCharacterCase
{
    public static void main(String[] args)
    {
        char ch = 'a';
        System.out.println(findCase(ch));
    }

    public static int findCase(char ch)
    {
        // Write your code here.

        if (Character.isAlphabetic(ch) && Character.isUpperCase(ch))
        {
            return 1;
        }
        else if (Character.isAlphabetic(ch) && Character.isLowerCase(ch))
        {
            return 0;
        }
        else
        {
            return -1;
        }
    }
}
