package com.org.expriments.multithreading;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * A thread trying to enqueue an element in a full queue is blocked until some other thread makes space in the queue, 
 * either by dequeuing one or more elements or clearing the queue completely. Similarly, it blocks a thread trying to delete 
 * from an empty queue until some other threads insert an item. BlockingQueue does not accept a null value. 
 * If we try to enqueue the null item, then it throws NullPointerException.
 */
public class ImplementingBlockingQueue
{
	public static void main(String[] args)
	{
		// Unbounded Blocking Queue
		BlockingQueue<String> blockingQueueUnbounded = new LinkedBlockingDeque<>(); // The Capacity of blockingQueue will be set to Integer.MAX_VALUE

		System.out.println(blockingQueueUnbounded.size());

		// Bounded Blocking Queue
		BlockingQueue<Integer> blockingQueueBounded = new LinkedBlockingDeque<>(10);

		blockingQueueBounded.add(1);
		blockingQueueBounded.add(2);
		blockingQueueBounded.add(3);
		blockingQueueBounded.add(4);
		blockingQueueBounded.add(5);
		System.out.println(blockingQueueBounded);

		blockingQueueBounded.remove();
		System.out.println(blockingQueueBounded);

		blockingQueueBounded.offer(6);
		System.out.println(blockingQueueBounded);

		blockingQueueBounded.poll();
		System.out.println(blockingQueueBounded);

		blockingQueueBounded.clear();
		System.out.println(blockingQueueBounded);

		blockingQueueBounded.offer(null);
		System.out.println(blockingQueueBounded);
	}

}
