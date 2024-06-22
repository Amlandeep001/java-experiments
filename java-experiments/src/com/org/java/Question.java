package com.org.java;

import java.util.stream.IntStream;

public class Question
{
	public static void main(String[] args)
	{
		IntStream.range(1, 10)
				.filter(i ->
				{
					System.out.print("1");
					return i % 2 == 0;
				})
				.filter(i ->
				{
					System.out.print("0");
					return i > 3;
				})
				.limit(1)
				.forEach(i ->
				{
					System.out.print("i");
				});
	}

}
