package com.org.codingninjas;

public class CountFrequency
{
    public static int[] findFrequency(String S)
    {
        // Write your code here.
        int[] freq = new int[26];

        // Traverse the string and update the frequency array
        for (char ch : S.toCharArray())
        {
            if (ch >= 'a' && ch <= 'z')
            {
                freq[ch - 'a']++;
            }
        }
        return freq;
    }

    public static void main(String[] args)
    {
        String S = "programming";
        int[] freq = findFrequency(S);

        // Print the frequency of each lowercase letter
        for (int i = 0; i < freq.length; i++)
        {
            System.out.println((char) ('a' + i) + ": " + freq[i]);
        }
    }
}
