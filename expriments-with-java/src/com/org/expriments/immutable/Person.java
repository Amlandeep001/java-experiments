package com.org.expriments.immutable;

import java.util.ArrayList;
import java.util.List;

//https://medium.com/javarevisited/immutable-class-in-java-88c50030f153
public final class Person
{
	private final String name;
	private final int age;
	private final List<String> hobbies;

	public Person(String name, int age, List<String> hobbies)
	{
		this.name = name;
		this.age = age;
		this.hobbies = new ArrayList<>(hobbies);
	}

	public String getName()
	{
		return name;
	}

	public int getAge()
	{
		return age;
	}

	public List<String> getHobbies()
	{
		return new ArrayList<>(hobbies);
	}
}