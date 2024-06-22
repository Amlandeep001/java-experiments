package com.org.expriments.functionalinterface.consumer;

public class ConsumerMain
{
	public static void main(String[] args)
	{
		MultiArgConsumer<String, Integer, Double, Boolean> consumer = (s, i, d, b) -> System.out.println("String: " + s + ", Integer: " + i + ", Double: " + d + ", Boolean: " + b);

		consumer.accept("Hello", 42, 3.14, true);
	}
}
