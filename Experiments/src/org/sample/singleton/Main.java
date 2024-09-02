package org.sample.singleton;

public class Main
{
    public static void main(String[] args)
    {

        SingleTon singleTon;

        // refers to the only object of Database
        singleTon = SingleTon.getInstance();

        singleTon.getMethod();
    }
}
