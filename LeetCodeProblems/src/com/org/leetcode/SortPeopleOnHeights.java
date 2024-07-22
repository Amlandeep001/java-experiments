package com.org.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//https://leetcode.com/problems/sort-the-people/description/?envType=daily-question&envId=2024-07-22
public class SortPeopleOnHeights
{
	public static void main(String[] args)
	{
		String[] names = {"Mary", "John", "Emma"};
		int[] heights = {180, 165, 170};
		System.out.println(Arrays.toString(sortPeople(names, heights)));
	}

	public static String[] sortPeople(String[] names, int[] heights)
	{
		List<Person> people = new ArrayList<>();

		for(int i = 0; i < names.length; i++)
		{
			people.add(new Person(names[i], heights[i]));
		}

		return people.stream()
				.sorted(Comparator.comparingInt(Person::getHeight).reversed())
				.map(Person::getName)
				.toArray(String[]::new);
	}
}

class Person
{
	private final String name;
	private final int height;

	public Person(String name, int height)
	{
		this.name = name;
		this.height = height;
	}

	public String getName()
	{
		return name;
	}

	public int getHeight()
	{
		return height;
	}
}