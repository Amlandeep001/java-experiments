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
	// Unbounded Blocking Queue
	BlockingQueue<String> blockingQueueUnbounded = new LinkedBlockingDeque<>(); // The Capacity of blockingQueue will be set to Integer.MAX_VALUE

	// Bounded Blocking Queue
	BlockingQueue<String> blockingQueueBounded = new LinkedBlockingDeque<>(10);

}
