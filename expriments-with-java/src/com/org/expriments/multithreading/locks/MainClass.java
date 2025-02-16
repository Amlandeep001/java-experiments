package com.org.expriments.multithreading.locks;

public class MainClass
{
    public static void main(String[] args)
    {
        BankAccount sbi = new BankAccount();
        Runnable task = new Runnable() // Anonymous class as Runnable is an Interface
        {
            @Override
            public void run()
            {
                sbi.withdraw(50);
            }
        };
        Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");
        t1.start();
        t2.start();
    }
}
