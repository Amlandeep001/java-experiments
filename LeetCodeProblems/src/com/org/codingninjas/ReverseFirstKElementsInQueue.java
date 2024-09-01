package com.org.codingninjas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//https://www.naukri.com/code360/problem-of-the-day/easy?leftPanelTabValue=PROBLEM
public class ReverseFirstKElementsInQueue
{
	public static void reverse(Queue<Integer> queue, int k)
	{
		// Write your code here.
		if(queue == null || k > queue.size() || k <= 0)
		{
			return;
		}

		Stack<Integer> stack = new Stack<>();
		for(int i = 0; i < k; i++)
		{
			stack.push(queue.poll());
		}

		while (!stack.isEmpty())
		{
			queue.add(stack.pop());
		}

		for(int j = 0; j < queue.size() - k; j++)
		{
			queue.add(queue.poll());
		}
	}

	public static void main(String[] args)
	{
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		queue.offer(4);
		queue.offer(5);

		reverse(queue, 3);

		System.out.println(queue); // Output: [3, 4, 5, 1, 2]
	}
}
