package com.org.codingninjas;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class ReversingAQueue
{
    public static void reverse(Queue<Integer> q)
    {
        // Write your code here.
        Stack<Integer> s = new Stack<>();

      /*while the queue is not empty , pop(offer) the front element
      from queue and insert(push) that element into the stack. */

        while (!q.isEmpty())
        {
            s.push(q.poll());  //Inserting into stack
        }

        System.out.println(s);

      /* Till the stack is not empty , pop the element from
      stack and insert(offer) it into the queue. */

        while (!s.isEmpty())
        {
            q.offer(s.pop());  //Inserting into queue
        }

        System.out.println(q);  //Printing the reversed queue.
    }

    public static void main(String[] args)
    {
        Queue<Integer> q = new LinkedList<>(List.of(1, 2, 3, 4, 5));
        reverse(q);
    }
}
