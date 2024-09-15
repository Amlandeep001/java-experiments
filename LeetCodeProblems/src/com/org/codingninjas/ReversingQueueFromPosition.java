package com.org.codingninjas;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ReversingQueueFromPosition
{
    public static Queue<Integer> reverseElements(Queue<Integer> q, int k)
    {
        // Write your code here.

        Queue<Integer> result = new LinkedList<>();
        List<Integer> list = q.stream()
                .toList();

        for (int i = k - 1; i >= 0; i--)
        {
            result.add(list.get(i));
            q.remove();
        }

        result.addAll(q);
        return result;
    }

    public static void main(String[] args)
    {
        Queue<Integer> q = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println(ReversingQueueFromPosition.reverseElements(q, 3));
    }

}
