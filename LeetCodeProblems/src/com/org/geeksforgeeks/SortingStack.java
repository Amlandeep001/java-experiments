package com.org.geeksforgeeks;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class SortingStack
{
	public Stack<Integer> sort(Stack<Integer> s)
	{
		List<Integer> stackToSortedList = s.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());

		Stack<Integer> sortedStackInReverse = new Stack<>();

		sortedStackInReverse.addAll(stackToSortedList);

		return sortedStackInReverse;
	}

	public static void main(String[] args)
	{
		List<Integer> al = Arrays.asList(11, 2, 32, 3, 41);
		Stack<Integer> s = new Stack<>();
		s.addAll(al);

		SortingStack ss = new SortingStack();

		System.out.println(ss.sort(s));
	}

}
