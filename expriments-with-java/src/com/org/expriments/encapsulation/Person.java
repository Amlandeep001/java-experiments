package com.org.expriments.encapsulation;

class Person
{
	// Encapsulating the name and age
	// only approachable and used applying
	// the methods defined
	private String name;
	private int age;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}
}
