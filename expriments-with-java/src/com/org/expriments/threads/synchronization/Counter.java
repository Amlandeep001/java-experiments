package com.org.expriments.threads.synchronization;

public class Counter
{
    private int count = 0;

    public int getCount()
    {
        return count;
    }

    public synchronized void increment()
    {
        count++;
    }

    public synchronized void decrement()
    {
        count--;
    }
}
