package com.org.expriments.immutable;

import java.util.ArrayList;

//https://medium.com/javarevisited/immutable-class-in-java-88c50030f153
public final class Person
{
	private final String name;
	private final int age;
	private final Address address;

	public Person(String name, int age, Address address)
	{
		this.name = name;
		this.age = age;
		this.address = new Address(address.getStreet(), address.getCity(), address.getState(), new ArrayList<>(address.getHobbies()));
	}

	public String getName()
	{
		return name;
	}

	public int getAge()
	{
		return age;
	}

	public Address getAddress()
	{
		return new Address(address.getStreet(), address.getCity(), address.getState(), new ArrayList<>(address.getHobbies()));
	}
}